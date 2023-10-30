package com.example.chat.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.chat.navigation.ChatRoutes
import com.example.core.utils.LocalNavController
import com.example.core.utils.Routes


@Composable
fun ProfileScreen() {
    Text(text = "Profile Screen")


    val navController = LocalNavController.current
    // ...
    Button(onClick = {
        navController.navigate(ChatRoutes.Group.withData(groupId = "Kareem GroupId"))

    }) {
        Text(text = "Navigate To Group")
    }


}




