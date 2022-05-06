package com.rodrigojscript.coffee4coders.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rodrigojscript.coffee4coders.R
import com.rodrigojscript.coffee4coders.ui.theme.PlatziBlue

@Composable
fun ProductCard() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .clickable { /*TODO*/ }
        .size(400.dp),
        elevation = 10.dp,
        shape = MaterialTheme.shapes.small
    ) {
        Image(
            painter = painterResource(id = R.drawable.co),
            contentDescription = null
        )
        Surface(modifier = Modifier.fillMaxWidth(), color = PlatziBlue.copy(alpha = 0.2f)) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Cafe de Colombia")
                Text(text = "Un cafe de origen de las montañas")
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.flagco),
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "$35.USD",
                            textAlign = TextAlign.End
                        )
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductCardPreview() {
    ProductCard()
}