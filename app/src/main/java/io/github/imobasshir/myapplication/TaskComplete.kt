package io.github.imobasshir.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.imobasshir.myapplication.ui.theme.MyApplicationTheme

@Composable
fun Done() {
    val img = painterResource(R.drawable.ic_task_completed)
    Box {
        Image(
            painter = img,
            contentDescription = null,
        )
    }
}

@Composable
fun TaskComplete() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Done()
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun TaskCompletePreview() {
//    MyApplicationTheme {
//        TaskComplete()
//    }
//}