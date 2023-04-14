package io.github.imobasshir.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.MaterialTheme
import androidx.compose.material.*
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.imobasshir.myapplication.ui.theme.MyApplicationTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MaterialDesignUse() {
    MaterialTheme {
        val snackbarHostState = remember { SnackbarHostState() }
        val scope = rememberCoroutineScope()
        val scaffoldState = rememberScaffoldState()
        Scaffold (
            snackbarHost = { SnackbarHost(snackbarHostState) },
            scaffoldState = scaffoldState,
            drawerContent = {
                // Drawer content
                LazyColumn {
                    items(10) {
                        ListItem(
                            text = { Text("Item $it") },
                            icon = {
                                Icon(
                                    Icons.Default.Favorite,
                                    contentDescription = "Localized description"
                                )
                            }
                        )
                    }
                }
            },
            drawerGesturesEnabled = true,
            topBar = {
                TopAppBar(
                    title = { Text("Material Design Use") },
                    elevation = 0.dp,
                    navigationIcon = {
                        IconButton(
                            onClick = { scope.launch { scaffoldState.drawerState.open() } },
                            content = {
                                Icon(
                                    Icons.Filled.Menu,
                                    contentDescription = "Menu",
                                    tint = Color.White,
                                )
                            }
                        )
                    }
                )
            },
            bottomBar = {
                BottomAppBar(
                    content = {
                        Text("Bottom Bar")
                    },
                    elevation = 0.dp,
                    cutoutShape = MaterialTheme.shapes.small.copy(
                        CornerSize(percent = 50)
                    )
                )
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {
                        // show snackbar
                        scope.launch {
                            snackbarHostState.showSnackbar(
                                "Fab Button Pressed",
                                duration = SnackbarDuration.Short
                            )
                        }
                    },
                    content = {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                        )
                    }
                )
            },
            floatingActionButtonPosition = FabPosition.Center,
            isFloatingActionButtonDocked = true,
            content = { contentPadding ->
                // Screen content
                Box(modifier = Modifier.padding(contentPadding)) { /* ... */ }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {
                            // show snackbar
                            scope.launch {
                                snackbarHostState.showSnackbar(
                                    "Like Button Pressed"
                                )
                            }
                        },
                        contentPadding = PaddingValues(
                            start = 20.dp,
                            top = 12.dp,
                            end = 20.dp,
                            bottom = 12.dp
                        )
                    ) {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = "Favorite",
                            modifier = Modifier.size(ButtonDefaults.IconSize)
                        )
                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                        Text("Like")
                    }
                }
            }
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun MaterialDesignUsePreview() {
    MyApplicationTheme {
        MaterialDesignUse()
    }
}