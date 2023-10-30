package com.example.chat.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.chat.navigation.ChatRoutes
import com.example.core.utils.LocalNavController
import com.example.core.utils.Routes


@Composable
fun GroupScreen(message: String) {
    val navController = LocalNavController.current

    Text(text = "Group Screen message : $message")

    // ...
    Button(onClick = { navController.navigate(ChatRoutes.Profile.route) }) {
        Text(text = "Navigate To Profile")
    }
    // ... other navigation actions
}



