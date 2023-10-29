package com.example.composenavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.core.utils.LocalNavController
import com.example.core.utils.Routes


@Composable
fun HomeScreen() {

    val navController = LocalNavController.current

    Column {
        Text(text = "Home  Screen")
        Button(onClick = {
            navController.navigate(Routes.Chat.Main.withData("HelloChat"))
        }) {
            Text(text = "To Chat Screen")
        }
    }
}

