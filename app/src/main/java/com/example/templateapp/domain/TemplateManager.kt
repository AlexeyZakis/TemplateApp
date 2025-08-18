package com.example.templateapp.domain

import kotlinx.coroutines.flow.StateFlow

interface TemplateManager {
    val templateFlow: StateFlow<Unit>

    fun onTemplate(param1: Unit)
}
