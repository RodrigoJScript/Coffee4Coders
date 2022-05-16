package com.rodrigojscript.coffee4coders.ui.screens

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.rodrigojscript.coffee4coders.ui.components.CustomTextField
import com.rodrigojscript.coffee4coders.ui.theme.BaseAppTheme

@Composable
fun CheckoutScreen() {
    var name by remember { mutableStateOf("") }

    CustomTextField(value = name, placeholder = "Nombre") {
        name = it
    }
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenPreview() {
    BaseAppTheme {
        CheckoutScreen()
    }
}