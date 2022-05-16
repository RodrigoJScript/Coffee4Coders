package com.rodrigojscript.coffee4coders.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rodrigojscript.coffee4coders.R
import com.rodrigojscript.coffee4coders.ui.components.*
import com.rodrigojscript.coffee4coders.ui.theme.BaseAppTheme

@Composable
fun DetailScreen(navController: NavController, countryISO: CountryISO) {
    Scaffold(
        topBar = {
            CustomAppBar(navigationIcon = Icons.Default.ArrowBack) {
                navController.navigate("feed") {
                    popUpTo("feed")
                }
            }
        },
        content = {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                ) {
                    Image(
                        painter = painterResource(id = countryISO.getBackgroundImage()),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Column(modifier = Modifier.padding(16.dp)) {
                    TitleText(title = "Cafe de Colombia")
                    Text(
                        text = "Red alert, senior alarm! The dubloon hauls with fortune, command the pacific ocean. All children like cooked chickpeas in beer and cinnamon. The brilliant mind is full of reincarnation.Classis moris, tanquam germanus homo.",
                        style = MaterialTheme.typography.caption
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    BodyText(text = "The addled cannon calmly raids the corsair. Assimilant satis ducunt ad alter fraticinida. The honor is a remarkable species.")
                    Spacer(modifier = Modifier.height(24.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Text(
                            text = "$ 35.0 USD",
                            style = MaterialTheme.typography.h5,
                            textAlign = TextAlign.End
                        )
                        CustomButton(label = "Continuar") {
                            navController.navigate("checkout/${countryISO.iso}") {
                                launchSingleTop = true
                            }
                        }
                    }

                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    BaseAppTheme {
        val navController = rememberNavController()
        DetailScreen(navController, CountryISO.BRA)
    }
}