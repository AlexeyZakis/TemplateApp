package com.example.templateapp.presentation.navigation

sealed class Route(val route: String) {
    data object TemplateScreenRoute : Route("TemplateScreenRoute")
}
