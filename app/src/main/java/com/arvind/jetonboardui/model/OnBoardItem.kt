package com.arvind.jetonboardui.model

import com.arvind.jetonboardui.R

class OnBoardItem(
    val title: Int,
    val text: Int,
    val image: Int
) {
    companion object {
        fun get(): List<OnBoardItem> {
            return listOf(
                OnBoardItem(
                    R.string.onbaord_title1,
                    R.string.onboard_text1,
                    R.drawable.slide_1
                ),
                OnBoardItem(
                    R.string.onbaord_title2,
                    R.string.onboard_text2,
                    R.drawable.slide_2
                ),
                OnBoardItem(
                    R.string.onbaord_title3,
                    R.string.onboard_text3,
                    R.drawable.slide_3
                ),
            )
        }
    }
}