package com.arvind.jetonboardui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arvind.jetonboardui.navigation.Navigation
import com.arvind.jetonboardui.navigation.Screen
import com.arvind.jetonboardui.ui.theme.JetOnBoardUITheme
import com.arvind.jetonboardui.view.FoodOnBoardScreen
import com.arvind.jetonboardui.view.LoginScreen
import com.arvind.jetonboardui.view.OnBoardScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetOnBoardUITheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    Navigation()

                }

            }
        }

    }
}
