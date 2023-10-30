package com.example.chat.navigation

import com.example.core.utils.Routes



sealed class ChatRoutes(val route: String) {

    object Main : ChatRoutes("$BASE_ROUTE/main/{$ARG_ID}") {
        fun withData(data: String): String {
            return route.replace("{$ARG_ID}", data)
        }
    }

    object Profile : ChatRoutes("$BASE_ROUTE/profile")

    object Group : ChatRoutes("$BASE_ROUTE/group/{$ARG_GROUP_ID}") {
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


