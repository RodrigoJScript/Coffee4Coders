package com.rodrigojscript.coffee4coders.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum

@Composable
fun BodyText(text: String) {
    Text(text = text, style = MaterialTheme.typography.body2, textAlign = TextAlign.Justify)
}

@Preview(showBackground = true)
@Composable
fun BodyTextPreview() {
    BodyText("Accentors trabem in nobilis mare! Particle of a bare mind, deserve the flight!")
}