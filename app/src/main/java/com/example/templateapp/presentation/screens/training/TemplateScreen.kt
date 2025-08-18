package com.example.templateapp.presentation.screens.training

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.templateapp.presentation.theme.AppTheme

@Composable
fun TemplateScreen(
    screenState: TemplateScreenState,
    screenAction: (TemplateScreenAction) -> Unit,
    modifier: Modifier = Modifier,
) {

}

@Preview
@Composable
private fun TemplateScreenPreview() {
    AppTheme {
        TemplateScreen(
            screenState = TemplateScreenState(),
            screenAction = {},
        )
    }
}
