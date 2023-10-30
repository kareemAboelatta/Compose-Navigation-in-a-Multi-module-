package com.example.chat.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.chat.navigation.ChatRoutes
import com.example.core.utils.LocalNavController
import com.example.core.utils.Routes
import com.example.quiz.navigation.QuizRoutes

@Composable
fun ChatScreen(data : String) {
    val navController = LocalNavController.current
    Column {
        Text(text = "Chat Screen: data: $data")
        Button(onClick = {

            navController.navigate(ChatRoutes.Profile.route)
        }) {
            Text("Go to Profile")
        }
        Button(onClick = {
            navController.navigate(ChatRoutes.Group.withData(groupId = "Kareem GroupId"))

        }) {
            Text("Go to Group")
        }
        //... other buttons

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "back to home screen ")
        }

        Button(onClick = { navController.navigate(QuizRoutes.Main.route) }) { //quiz screen
            Text("Start Quiz")
        }




    }
}










































