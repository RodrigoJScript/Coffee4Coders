package com.rodrigojscript.coffee4coders.ui.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.rodrigojscript.coffee4coders.ui.theme.BaseAppTheme

typealias OnCLose = () -> Unit

@Composable
fun CustomAlert(title: String, message: String?, onClose: OnCLose) {
    if (message != null) {
        AlertDialog(onDismissRequest = { onClose }, title = {
            Text(
                text = title, style = TextStyle(
                    Color.Black
                )
            )
        },
            text = {
                Text(text = message)
            }, buttons = {
                Button(onClick = { onClose }) {
                    Text(text = "OK")
                }
            })
    }
}

@Preview(showBackground = true)
@Composable
fun CustomAlertPreview() {
    BaseAppTheme {
        CustomAlert("ffff", "jghjghfgh") {}
    }
}