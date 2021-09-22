package com.arvind.jetonboardui.navigation

sealed class Screen(val route: String) {
    object OnBoardScreen : Screen("on_board_screen")
    object FoodAppOnBoardScreen : Screen("food_app_on_board_screen")
    object LoginScreen : Screen("login_screen")

}
