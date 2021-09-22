package com.arvind.jetonboardui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.arvind.jetonboardui.components.OnBoardBottomSection
import com.arvind.jetonboardui.components.OnBoardComponent
import com.arvind.jetonboardui.model.OnBoardItem
import com.arvind.jetonboardui.navigation.Screen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@ExperimentalPagerApi
@Composable
fun OnBoardScreen(navController: NavController) {
    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {
        val items = OnBoardItem.get()
        val state = rememberPagerState(pageCount = items.size)

        HorizontalPager(
            state = state,
            modifier = Modifier
                .fillMaxSize()
                .weight(0.8f)
        ) { page ->
            OnBoardComponent(items[page])
        }

        OnBoardBottomSection(
            size = items.size,
            index = state.currentPage,
            state = state,
        ) {
            if (state.currentPage + 1 < items.size) {
                scope.launch { state.scrollToPage(state.currentPage + 1) }
            }
            if (state.currentPage + 1 == items.size) {
                scope.launch {
                    navController.popBackStack()
                    navController.navigate(Screen.LoginScreen.route)
                }
            }
        }

    }
}