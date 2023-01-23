package io.github.imobasshir.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.imobasshir.myapplication.ui.theme.MyApplicationTheme

@Composable
fun StateManagementInCompose() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("State Management Compose") },
                elevation = 0.dp,
            )
        }
    ) { contentPadding ->
        Box(modifier = Modifier.padding(contentPadding)) { /* ... */ }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            /* it will work for the first time only or before orientation or page is not changed
            val count = remember { mutableStateOf(0) } */
            /* it will work for all the time irrespective of page orientation of screen */
            val count = rememberSaveable { mutableStateOf(0) }
            Button(onClick = { count.value++ }) {
                Text("Count: ${count.value}")
            }
        }
    }
}

@Preview
@Composable
fun StateManagementInComposePreview() {
    MyApplicationTheme(darkTheme = false) {
        StateManagementInCompose()
    }
}