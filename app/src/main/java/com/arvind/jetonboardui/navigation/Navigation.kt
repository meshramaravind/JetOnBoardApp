package com.arvind.jetonboardui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arvind.jetonboardui.view.FoodOnBoardScreen
import com.arvind.jetonboardui.view.LoginScreen
import com.arvind.jetonboardui.view.OnBoardScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.OnBoardScreen.route
    ) {
        composable(
            route = Screen.OnBoardScreen.route
        ) {
            OnBoardScreen(navController)
        }

        composable(
            route = Screen.LoginScreen.route
        ) {
            LoginScreen()
        }

        composable(
            route = Screen.FoodAppOnBoardScreen.route
        ) {
            FoodOnBoardScreen(navController)
        }

    }

}