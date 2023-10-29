package com.example.core.utils


sealed class Routes(val route: String) {
    object Home : Routes("home")

    sealed class Chat(chatRoute: String) : Routes("$BASE_ROUTE/$chatRoute") {
        object Main : Chat("main/{$ARG_ID}") {
            fun withData(data: String): String {
                return route.replace("{$ARG_ID}", data)
            }
        }

        object Profile : Chat("profile")

        object Group : Chat("group/{$ARG_GROUP_ID}") {
            fun withData(groupId: String): String {
                return route.replace("{$ARG_GROUP_ID}", groupId)
            }
        }

        companion object {
            const val BASE_ROUTE = "chat"
            const val ARG_ID = "id"
            const val ARG_GROUP_ID = "groupId"
        }
    }

    object Quiz : Routes("quiz")
}
