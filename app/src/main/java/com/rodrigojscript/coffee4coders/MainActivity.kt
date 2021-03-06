package com.rodrigojscript.coffee4coders

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rodrigojscript.coffee4coders.providers.MockDataProvider
import com.rodrigojscript.coffee4coders.ui.components.CountryISO
import com.rodrigojscript.coffee4coders.ui.screens.CheckoutScreen
import com.rodrigojscript.coffee4coders.ui.screens.DetailScreen
import com.rodrigojscript.coffee4coders.ui.screens.FeedScreen
import com.rodrigojscript.coffee4coders.ui.theme.BaseAppTheme
import com.rodrigojscript.coffee4coders.ui.theme.Coffee4CodersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationHost()
        }
    }
}

@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    BaseAppTheme {
        NavHost(navController = navController, startDestination = "feed") {
            composable(route = "feed") {
                FeedScreen(navController)
            }
            composable(route = "detail/{productId}") { backStackEntry ->
                val productIdString =
                    backStackEntry.arguments?.getString("productId") ?: "0"
                val productId = productIdString.toInt()
                val product = MockDataProvider.getProduct(productId)
                DetailScreen(navController, product!!)
            }
            composable(route = "checkout/{productId}") { backStackEntry ->
                val productIdString =
                    backStackEntry.arguments?.getString("productId") ?: "0"
                val productId = productIdString.toInt()
                val product = MockDataProvider.getProduct(productId)
                CheckoutScreen(navController, product!!)
            }
        }
    }
}

