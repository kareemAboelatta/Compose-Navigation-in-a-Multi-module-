package com.example.quiz.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.core.utils.LocalNavController


@Composable
fun QuizScreen() {

    val navController = LocalNavController.current




    Column {
        Text(text = "Quiz Screen")

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "back to chat screen ")
        }



    }

}









































