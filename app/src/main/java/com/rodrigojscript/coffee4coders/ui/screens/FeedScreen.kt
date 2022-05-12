package com.rodrigojscript.coffee4coders.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rodrigojscript.coffee4coders.ui.components.*
import com.rodrigojscript.coffee4coders.ui.theme.Coffee4CodersTheme

@Composable
fun FeedScreen(navController: NavController) {
    val list = listOf<CountryISO>(
        CountryISO.COL, CountryISO.CRI, CountryISO.BRA, CountryISO.NIC
    )

    Scaffold(
        topBar = {
            CustomAppBar("Coffee4Coders")
        },
        content = {
            Coffee4CodersTheme() {
                Surface(color = MaterialTheme.colors.background) {
                    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        item {
                            Column(modifier = Modifier.padding(8.dp)) {
                                TitleText(title = "Bienvenido")
                                BodyText(text = "Jolly roger, arrr. Buxums sunt abactors de regius animalis.")
                            }
                        }
                        items(list) { country ->
                            ProductCard(
                                name = "Cafe de Colombia",
                                summary = "Cafe de las montañas",
                                price = 35.00,
                                currency = "USD",
                                country = country
                            ) {
                                navController.navigate(route = "detail/${country.iso}") {
                                    launchSingleTop = true
                                }
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
fun FeedScreenPreview() {
    val navController = rememberNavController()
    FeedScreen(navController)
}