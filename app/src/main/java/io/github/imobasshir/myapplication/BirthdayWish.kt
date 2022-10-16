package io.github.imobasshir.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.imobasshir.myapplication.ui.theme.MyApplicationTheme

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    Column {
        Text(
            text = message,
            fontSize = 28.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = from,
            fontSize = 21.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(painter = image, contentDescription = null, modifier = Modifier.fillMaxHeight().fillMaxWidth(), contentScale = ContentScale.Crop)
        BirthdayGreetingWithText(message = message, from = from)
    }
}

//@Preview(showBackground = false)
//@Composable
//fun BirthdayCardPreview() {
//    MyApplicationTheme {
//        BirthdayGreetingWithImage(message = "Happy Birthday Mobasshir!", from = " - from Ibrahim")
//    }
//}