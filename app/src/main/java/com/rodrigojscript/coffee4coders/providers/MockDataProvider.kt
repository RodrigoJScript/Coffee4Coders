package com.rodrigojscript.coffee4coders.providers

import com.rodrigojscript.coffee4coders.models.Product
import com.rodrigojscript.coffee4coders.ui.components.CountryISO

class MockDataProvider {
    companion object {
        fun listOfProducts(): List<Product> {
            return listOf(
                Product(
                    id = 0,
                    name = "Cafe de Colombia",
                    summary = "All children like chopped strawberries in white wine and baking powder.",
                    description = "Per guest prepare one package of sweet chili sauce with mashed leek for dessert.",
                    price = 35.00,
                    currency = "USD",
                    countryISO = "COL"
                ),
                Product(
                    id = 1,
                    name = "Cafe de Costa Rica",
                    summary = "To the grey peanuts add ground beef, carrots, peppermint tea and canned strudel.",
                    description = "Chili can be tossed with crusted chicken, also try soaking the ricotta with mayonnaise.",
                    price = 34.00,
                    currency = "USD",
                    countryISO = "CRI"
                ),
                Product(
                    id = 2,
                    name = "Cafe de Nicaragua",
                    summary = "Try blending the salsa verde bagels with bitter whipped cream and sour milk, heated.",
                    description = "Carrots can be flavored with smooth ramen, also try rinseing the mousse with sweet chili sauce.",
                    price = 33.00,
                    currency = "USD",
                    countryISO = "NIC"
                ),
                Product(
                    id = 3,
                    name = "Cafe de Brasil",
                    summary = "All children like heated spinach in buttermilk and brown sugar.",
                    description = "Steak can be rubed with sticky mackerel, also try covering the porridge with maple syrup.",
                    price = 32.00,
                    currency = "USD",
                    countryISO = "BRA"
                )
            )
        }

        fun getProduct(id: Int): Product? {
            val list = MockDataProvider.listOfProducts()
            val product = list.find { it.id == id }
            return product
        }

        fun listOfCities(): List<String> {
            return listOf<String>(
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
        }
    }
}