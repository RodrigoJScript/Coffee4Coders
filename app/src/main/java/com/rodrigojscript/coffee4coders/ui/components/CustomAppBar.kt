package com.rodrigojscript.coffee4coders.ui.components

import android.widget.ImageButton
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.rodrigojscript.coffee4coders.ui.theme.Coffee4CodersTheme

typealias NavigationAction = () -> Unit

@Composable
fun CustomAppBar(
    title: String? = null,
    navigationIcon: ImageVector? = null,
    navigationAction: NavigationAction? = null
) {
    val titleText = title ?: "Coffe4Coders"
    if (navigationIcon != null && navigationAction != null) {
        TopAppBar(
            title = { Text(text = titleText) },
            backgroundColor = MaterialTheme.colors.primary,
            navigationIcon = {
                IconButton(onClick = {
                    navigationAction()
                }) {
                    Icon(navigationIcon, contentDescription = null)
                }
            }
        )
    } else {
        TopAppBar(
            title = { Text(text = titleText) },
            backgroundColor = MaterialTheme.colors.primary
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CustomAppBarPreview() {
    Coffee4CodersTheme {
        CustomAppBar(title = "Coffee4Coder")
    }
}