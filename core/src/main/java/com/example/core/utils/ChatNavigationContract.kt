package com.example.core.utils

import androidx.compose.runtime.Composable

interface NavigationEntry {
    val route: String
    val composable: @Composable () -> Unit
}


interface ChatNavigationContract {
    val entries: List<NavigationEntry>
}

