package com.example.mybank.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mybank.screens.HomeScreen
import com.example.mybank.screens.PagarServiciosScreen
import com.example.mybank.screens.PagarTarjetaScreen
import com.example.mybank.screens.TransferenciasScreen

@Composable
fun BankNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.HomeScreen.name,
    ){
        composable (NavScreen.HomeScreen.name) {
                HomeScreen()
            }

        composable (NavScreen.TransferenciasScreen.name) {
            TransferenciasScreen()
        }

        composable (NavScreen.PagarServiciosScreen.name) {
            PagarServiciosScreen()
        }

        composable (NavScreen.PagarTarjetasScreen.name) {
            PagarTarjetaScreen()
        }


    }


}

