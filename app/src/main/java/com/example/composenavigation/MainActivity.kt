package com.example.composenavigation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.chat.navigation.ChatRoutes
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.example.core.utils.ChatNavigationContract
import com.example.core.utils.LocalNavController
import com.example.core.utils.Routes
import com.example.quiz.navigation.QuizRoutes
import com.example.quiz.ui.QuizScreen
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

private const val TAG = "MainActivity"

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

                        composable(QuizRoutes.Main.route) {
                            // Quiz Screen (this will navigate to the quiz module's main screen)
                            QuizScreen()
                        }

                        navigation(route = ChatRoutes.BASE_ROUTE, startDestination = ChatRoutes.Main.route){
                            // Register chat module screens
                            chatNavigator.entries.forEach { entry ->
                                composable(entry.route) {
                                    Log.d(TAG, "onCreate: entry.route: ${entry.route}")
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

