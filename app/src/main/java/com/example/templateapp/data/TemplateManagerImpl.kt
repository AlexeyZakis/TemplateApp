package com.example.templateapp.data

import com.example.templateapp.domain.TemplateManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class TemplateManagerImpl : TemplateManager {
    private var _templateFlow: MutableStateFlow<Unit> =
        MutableStateFlow(Unit)
    override val templateFlow = _templateFlow.asStateFlow()

    override fun onTemplate(param1: Unit) = Unit
}
