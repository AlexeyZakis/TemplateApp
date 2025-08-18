package com.example.templateapp.presentation.screens.training

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.templateapp.domain.usecase.templateManager.GetTemplateStateFlowUseCase
import com.example.templateapp.domain.usecase.templateManager.TemplateUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class TemplateScreenViewModel @Inject constructor(
    private val onTemplateUseCase: TemplateUseCase,
    getTemplateStateFlowUseCase: GetTemplateStateFlowUseCase,
) : ViewModel() {
    private val _screenState = MutableStateFlow(TemplateScreenState())
    val screenState = _screenState.asStateFlow()

    private val templateStateFlow = getTemplateStateFlowUseCase()

    init {
        templateStateFlow.onEach { templateStateFlow ->
            _screenState.update { screenState ->
                screenState.copy(
                    param1 = templateStateFlow,
                )
            }
        }.launchIn(viewModelScope)
    }

    fun screenAction(action: TemplateScreenAction) {
        when (action) {
            is TemplateScreenAction.OnTemplateParam -> onTemplateParam(action.param1)
            is TemplateScreenAction.OnTemplate -> onTemplate()
        }
    }

    private fun onTemplateParam(param1: Unit) {
        onTemplateUseCase(
            param1 = param1
        )
    }

    private fun onTemplate() {

    }
}
