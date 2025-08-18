package com.example.templateapp.domain.usecase.templateManager

import com.example.templateapp.domain.TemplateManager

class TemplateUseCase(
    private val templateManager: TemplateManager,
) {
    operator fun invoke(param1: Unit) =
        templateManager.onTemplate(param1 = param1)
}