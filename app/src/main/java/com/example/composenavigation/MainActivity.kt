package com.example.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.chat.ui.ChatScreen
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.example.core.utils.ChatNavigationContract
import com.example.core.utils.LocalNavController
import com.example.core.utils.Routes
import com.example.quiz.ui.QuizScreen
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : ComponentActivity() {



    @Inject
    lateinit var chatNavigator: ChatNavigationContract



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


                        composable(Routes.Quiz.route) {
                            // Quiz Screen (this will navigate to the quiz module's main screen)
                            QuizScreen()

                        }

                        navigation(route = "chat", startDestination = Routes.Chat.Main.route){
                            // Register chat module screens
                            chatNavigator.entries.forEach { entry ->
                                composable(entry.route) {
                                    entry.composable()
                                }
                            }
                        }


                    }
                }



            }
        }
    }

}

