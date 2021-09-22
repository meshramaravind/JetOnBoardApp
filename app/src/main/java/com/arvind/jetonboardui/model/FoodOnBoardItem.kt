package com.arvind.jetonboardui.model

import com.arvind.jetonboardui.R

class FoodOnBoardItem(
    val title: Int,
    val text: Int,
    val image: Int
) {
    companion object {
        fun get(): List<FoodOnBoardItem> {
            return listOf(
                FoodOnBoardItem(
                    R.string.onbaord_title1_food,
                    R.string.onboard_text1_food,
                    R.drawable.fstep_one
                ),
                FoodOnBoardItem(
                    R.string.onbaord_title2_food,
                    R.string.onboard_text2_food,
                    R.drawable.fstep_two
                ),
                FoodOnBoardItem(
                    R.string.onbaord_title3_food,
                    R.string.onboard_text3_food,
                    R.drawable.fstep_three
                ),
            )
        }
    }
}