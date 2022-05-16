package com.rodrigojscript.coffee4coders.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.DropdownMenu
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rodrigojscript.coffee4coders.models.Product
import com.rodrigojscript.coffee4coders.providers.MockDataProvider
import com.rodrigojscript.coffee4coders.ui.components.*
import com.rodrigojscript.coffee4coders.ui.theme.BaseAppTheme

@Composable
fun CheckoutScreen(navController: NavController, product: Product) {
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
    var city by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var adress by remember { mutableStateOf("") }

    Scaffold(topBar = {
        CustomAppBar(navigationIcon = Icons.Filled.ArrowBack) {
            navController.navigate("detail/${product.id}")
        }
    }, content = {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            ProductCard(product) {}

            Column(modifier = Modifier.padding(16.dp)) {
                CustomTextField(value = name, placeholder = "Nombre") { name = it }
                CustomTextField(value = phone, placeholder = "Telefono") { phone = it }
                CustomTextField(value = email, placeholder = "Email") { email = it }
                CustomTextField(value = adress, placeholder = "Direccion") { adress = it }
                CustomDropdownTextField(
                    suggestions = cities,
                    value = city,
                    placeholder = "Ciudad"
                ) {
                    city = it
                }
                Column {
                    Row {
                        Text("SubTotal", style = MaterialTheme.typography.caption)
                        Text(
                            "$ 35.0 USD",
                            style = MaterialTheme.typography.caption,
                            textAlign = TextAlign.End,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Row {
                        Text("Envio", style = MaterialTheme.typography.caption)
                        Text(
                            "$ 15.0 USD",
                            style = MaterialTheme.typography.caption,
                            textAlign = TextAlign.End,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    Text(
                        text = "$ 45.0 USD",
                        style = MaterialTheme.typography.h5,
                        textAlign = TextAlign.Start
                    )
                    CustomButton(label = "Finalizar pedido") {

                    }
                }
            }
        }
    })
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenPreview() {

    val product = MockDataProvider.getProduct(0)
    val navController = rememberNavController()
    if (product != null) {
        BaseAppTheme {
            CheckoutScreen(navController, product)
        }
    }

}