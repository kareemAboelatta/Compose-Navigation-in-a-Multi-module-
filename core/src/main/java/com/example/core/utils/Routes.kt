package com.example.core.utils



sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Chat : Routes("chat")
    object Quiz : Routes("quiz")
}


