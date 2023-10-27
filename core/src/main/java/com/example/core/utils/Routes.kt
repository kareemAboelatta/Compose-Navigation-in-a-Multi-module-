package com.example.core.utils




sealed class Routes(val route: String) {
    object Home : Routes("home")
    sealed class Chat(val chatRoute: String) : Routes("chat/$chatRoute") {

        object Main : Chat("main")
        object Profile : Chat("profile")
        object Group : Chat("group")
    }
    object Quiz : Routes("quiz")
}
