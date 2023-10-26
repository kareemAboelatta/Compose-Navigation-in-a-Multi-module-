package com.example.chat.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.core.utils.LocalNavController
import com.example.core.utils.Routes


@Composable
fun ChatScreen() {


    val navController = LocalNavController.current





    Column {
        Text(text = "Chat  Screen")
        Button(onClick = { navController.navigate(Routes.Quiz.route) }) {
            Text("Start Quiz")
        }

        Button(onClick = {

        }) {
            Text(text = "To Home Screen")
        }


        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "back to home screen ")
        }




    }

}









































