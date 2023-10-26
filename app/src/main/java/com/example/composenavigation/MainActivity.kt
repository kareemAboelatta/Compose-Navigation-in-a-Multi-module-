package com.example.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chat.ui.ChatScreen
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.example.core.utils.LocalNavController
import com.example.core.utils.Routes
import com.example.quiz.ui.QuizScreen
import dagger.hilt.android.AndroidEntryPoint






@AndroidEntryPoint
class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {

                val navController = rememberNavController()

                CompositionLocalProvider(LocalNavController provides navController) {
                    NavHost(navController, startDestination = Routes.Home.route) {

                        composable(Routes.Home.route) {
                            // Home Screen
                            HomeScreen()
                        }
                        composable(Routes.Chat.route) {
                            // Chat Screen (this will navigate to the chat module's main screen)
                            ChatScreen()
                        }
                        composable(Routes.Quiz.route) {
                            // Quiz Screen (this will navigate to the quiz module's main screen)
                            QuizScreen()

                        }
                    }
                }





            }
        }
    }

}

