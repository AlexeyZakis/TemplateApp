package com.example.templateapp.presentation.di.modules

import com.example.templateapp.data.TemplateManagerImpl
import com.example.templateapp.domain.TemplateManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ManagersModule {
    @Provides
    @Singleton
    fun provideRandomManager(): TemplateManager =
        TemplateManagerImpl()
}
