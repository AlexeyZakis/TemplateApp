package com.example.templateapp.domain.usecase.templateManager

import com.example.templateapp.domain.TemplateManager

class GetTemplateStateFlowUseCase(
    private val templateManager: TemplateManager,
) {
    operator fun invoke() =
        templateManager.templateFlow
}