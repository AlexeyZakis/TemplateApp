package com.example.templateapp.presentation.screens.template

sealed class TemplateScreenAction {
    data class OnTemplateParam(val param1: Unit) : TemplateScreenAction()
    data object OnTemplate : TemplateScreenAction()
}
