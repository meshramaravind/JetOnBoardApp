package com.arvind.jetonboardui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.jetonboardui.model.OnBoardItem

@Composable
fun OnBoardComponent(item: OnBoardItem) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = item.image),
            contentDescription = "on board image",
            modifier = Modifier
                .fillMaxWidth()
                .height(380.dp)
        )
        Spacer(modifier = Modifier.padding(50.dp))

        Text(
            text = stringResource(item.title),
            style = MaterialTheme.typography.body1,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Text(
            text = stringResource(item.text),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.body1,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp

        )

    }
}