package com.arvind.jetonboardui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.arvind.jetonboardui.R
import com.arvind.jetonboardui.ui.theme.ColorGreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.PagerState

@ExperimentalPagerApi
@Composable
fun FoodOnBoardBottomSection(
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

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextButton(
                onClick = onNextClicked
            ) {
                Text(
                    text = stringResource(id = R.string.text_skip),
                    textAlign = TextAlign.Center,
                    color = Color.Gray
                )
            }
            HorizontalPagerIndicator(
                pagerState = state,
                modifier = Modifier
                    .clip(CircleShape),
                activeColor = ColorGreen,
                inactiveColor = Color.LightGray
            )

            IconButton(onClick = onNextClicked) {
                Icon(
                    Icons.Filled.ArrowForward,
                    "Next",
                    tint = ColorGreen
                )

            }


        }
    }
}