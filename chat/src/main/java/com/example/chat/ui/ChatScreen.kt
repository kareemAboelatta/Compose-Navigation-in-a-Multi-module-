package com.example.chat.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.core.utils.LocalNavController
import com.example.core.utils.Routes

@Composable
fun ChatScreen(data : String) {
    val navController = LocalNavController.current
    Column {
        Text(text = "Chat Screen: data: $data")
        Button(onClick = {

            navController.navigate(Routes.Chat.Profile.route)
        }) {
            Text("Go to Profile")
        }
        Button(onClick = {
            navController.navigate(Routes.Chat.Group.withData(groupId = "Kareem GroupId"))

        }) {
            Text("Go to Group")
        }
        //... other buttons

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "back to home screen ")
        }

        Button(onClick = { navController.navigate(Routes.Quiz.route) }) { //quiz screen
            Text("Start Quiz")
        }




    }
}










































