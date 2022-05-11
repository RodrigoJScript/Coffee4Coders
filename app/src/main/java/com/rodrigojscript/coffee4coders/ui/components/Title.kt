package com.rodrigojscript.coffee4coders.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TitleText(title: String) {
    Text(text = title, style = MaterialTheme.typography.h3)
}

@Preview(showBackground = true)
@Composable
fun TitleTextPreview() {
    TitleText("Hola")
}