package com.arvind.jetonboardui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.arvind.jetonboardui.R
import com.arvind.jetonboardui.navigation.Screen
import com.arvind.jetonboardui.ui.theme.ColorCyan
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.PagerState

@ExperimentalPagerApi
@Composable
fun OnBoardBottomSection(
    size: Int,
    index: Int,
    state: PagerState,
    onNextClicked: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            HorizontalPagerIndicator(
                pagerState = state,
                modifier = Modifier
                    .clip(CircleShape),
            )
            Spacer(modifier = Modifier.padding(16.dp))

            Button(
                onClick = onNextClicked,
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.elevation(8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = ColorCyan),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(bottom = 8.dp, end = 8.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.text_book_trip),
                    style = MaterialTheme.typography.subtitle1,
                    color = Color.White
                )
            }

            TextButton(
                onClick = {

                }
            ) {
                Text(
                    text = stringResource(id = R.string.text_sign_in),
                    textAlign = TextAlign.Center,
                    color = Color.Gray
                )
            }
        }


    }

}