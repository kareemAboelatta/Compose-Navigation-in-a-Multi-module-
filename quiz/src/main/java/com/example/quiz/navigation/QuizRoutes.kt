package com.example.quiz.navigation






sealed class QuizRoutes(val route: String) {
    object Main : QuizRoutes("$BASE_ROUTE/main")
    object Results : QuizRoutes("$BASE_ROUTE/results")

    companion object {
        const val BASE_ROUTE = "quiz"
        const val ARG_ID = "id"
        const val ARG_GROUP_ID = "groupId"
    }



}