package com.rodrigojscript.coffee4coders.ui.screens

import androidx.compose.material.DropdownMenu
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.rodrigojscript.coffee4coders.ui.components.CustomDropdownTextField
import com.rodrigojscript.coffee4coders.ui.components.CustomTextField
import com.rodrigojscript.coffee4coders.ui.theme.BaseAppTheme

@Composable
fun CheckoutScreen() {
    var city by remember { mutableStateOf("") }
    val cities = listOf<String>(
        "All",
        "children",
        "like",
        "sliced",
        "lobsters",
        "in",
        "whiskey",
        "and",
        "chipotle",
        "chile",
        "powder"
    )

    CustomDropdownTextField(suggestions = cities, value = city, placeholder = "Ciudad") {
        city = it
    }
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenPreview() {
    BaseAppTheme {
        CheckoutScreen()
    }
}