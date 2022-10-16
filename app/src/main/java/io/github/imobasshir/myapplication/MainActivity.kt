package io.github.imobasshir.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.imobasshir.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    QuadrantCompose()
                }
            }
        }
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

@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    MyApplicationTheme {
        BirthdayGreetingWithImage(message = "Happy Birthday Mobasshir!", from = " - from Ibrahim")
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCompletePreview() {
    MyApplicationTheme {
        TaskComplete()
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantComposePreview() {
    MyApplicationTheme {
        QuadrantCompose()
    }
}