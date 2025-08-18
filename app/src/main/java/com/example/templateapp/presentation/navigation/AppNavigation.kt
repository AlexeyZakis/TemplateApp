package com.example.templateapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalConfiguration
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.templateapp.presentation.screens.training.TemplateScreen
import com.example.templateapp.presentation.screens.training.TemplateScreenViewModel

@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()
    val isTabletMode = isTablet()

    NavHost(
        navController = navController,
        startDestination = Route.TemplateScreenRoute.route
    ) {
        composable(
            route = Route.TemplateScreenRoute.route,
        ) {
            val templateScreenViewModel: TemplateScreenViewModel = hiltViewModel()
            val templateScreenState by templateScreenViewModel.screenState.collectAsState()
            TemplateScreen(
                screenState = templateScreenState,
                screenAction = templateScreenViewModel::screenAction,
            )
        }
    }
}

@Composable
private fun isTablet(): Boolean {
    val configuration = LocalConfiguration.current
    return configuration.screenHeightDp >= 600
}
