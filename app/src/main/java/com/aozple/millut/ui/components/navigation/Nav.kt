package com.aozple.millut.ui.components.navigation

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MillutNav() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.HOME.route) {
        composable(
            route = Routes.HOME.route,
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 300, easing = LinearEasing), initialAlpha = 0.92f) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 300, easing = LinearEasing), targetAlpha = 0.92f) }
        ) {
        }
    }
}