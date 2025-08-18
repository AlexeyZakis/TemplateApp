package com.example.templateapp.presentation.di.usecases.managers

import com.example.templateapp.domain.TemplateManager
import com.example.templateapp.domain.usecase.templateManager.GetTemplateStateFlowUseCase
import com.example.templateapp.domain.usecase.templateManager.TemplateUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class TemplateViewModelModule {
    @Provides
    fun provideGetTemplateStateFlowUseCase(templateManager: TemplateManager) =
        GetTemplateStateFlowUseCase(templateManager = templateManager)

    @Provides
    fun provideTemplateUseCase(templateManager: TemplateManager) =
        TemplateUseCase(templateManager = templateManager)
}
