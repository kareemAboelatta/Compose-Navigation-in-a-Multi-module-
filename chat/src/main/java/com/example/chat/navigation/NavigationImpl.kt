package com.example.chat.navigation

import androidx.compose.runtime.Composable
import com.example.chat.ui.ChatScreen
import com.example.chat.ui.GroupScreen
import com.example.chat.ui.ProfileScreen
import com.example.core.utils.ChatNavigationContract
import com.example.core.utils.LocalNavController
import com.example.core.utils.NavigationEntry


// ChatNavigationImpl.kt in the chat module

class ChatNavigationImpl : ChatNavigationContract {

    override val entries: List<NavigationEntry> = listOf(
        object : NavigationEntry {
            override val route = ChatRoutes.Main.route
            override val composable = @Composable {
                val navController = LocalNavController.current
                val data = navController.currentBackStackEntry?.arguments?.getString(ChatRoutes.ARG_ID) ?: ""
                ChatScreen(data = data)
            }
        },
        object : NavigationEntry {
            override val route = ChatRoutes.Profile.route
            override val composable = @Composable {
                ProfileScreen()
            }
        },
        object : NavigationEntry {
            override val route = ChatRoutes.Group.route
            override val composable = @Composable {
                val navController = LocalNavController.current
                val message = navController.currentBackStackEntry?.arguments?.getString(ChatRoutes.ARG_GROUP_ID) ?: ""
                GroupScreen(message = message)
            }
        }
    )
}



