package com.aozple.millut.ui.components.navigation

sealed class Routes(val route: String) {
    data object HOME : Routes("home_screen")
}