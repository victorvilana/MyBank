package com.example.mybank.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.mybank.models.ItemsBotonNav
import com.example.mybank.navigation.CurrentRoute

@Composable
fun NavegacionInferior(
    navController: NavHostController
) {
    val menuItems = listOf(
        ItemsBotonNav.ItemBottom_1,
        ItemsBotonNav.ItemBottom_2,
        ItemsBotonNav.ItemBottom_3,
    )



    BottomAppBar {
        NavigationBar (
            //containerColor = MaterialTheme.colorScheme.onPrimaryContainer,
        ) {
            menuItems.forEach { item ->
                val selected = CurrentRoute(navController) == item.ruta.name

                NavigationBarItem(
                    selected = selected,
                    onClick = { navController.navigate(item.ruta.name) },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title
                        )
                    },
                    label = { Text(text = item.title) }
                )
            }
        }
    }
}