package com.example.core.utils

import android.util.Log
import kotlin.math.log


sealed class Routes(val route: String) {
    object Home : Routes("home")

    sealed class Chat(val chatRoute: String) : Routes("$BASE_ROUTE/$chatRoute") {
        object Main : Chat("main/{data}") {
            fun toMainChat(data: String): String {
                return route.replace("{data}", data)
            }
        }


        object Profile : Chat("profile")
        object Group : Chat("group/{message}")  // Here, 'message' is the argument we are passing

        companion object {
            const val BASE_ROUTE = "chat"
        }
    }

    object Quiz : Routes("quiz")
}
