package io.github.imobasshir.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.imobasshir.myapplication.ui.theme.MyApplicationTheme

@Composable
fun ArticleImage() {
    val articleImg = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(
            painter = articleImg,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
    }
}

@Composable
fun Article(head: String, first: String, second: String) {
    Column {
        ArticleImage()
        Text(
            text = head,
            fontSize = 24.sp,
            modifier = Modifier.padding(all = 16.dp)
        )
        Text(
            text = first,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = second,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ArticleComposerPreview() {
    MyApplicationTheme {
        Article(
            head = "Jetpack Compose tutorial",
            first = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            second = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
        )
    }
}