package com.rodrigojscript.coffee4coders.ui.theme

import android.view.Surface
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable

@Composable
fun BaseAppTheme(content: @Composable () -> Unit) {
    Coffee4CodersTheme {
        Surface(color = MaterialTheme.colors.background)
        {
            content()
        }
    }
}