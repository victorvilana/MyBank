package com.example.mybank.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AttachMoney
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.PriceCheck
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mybank.navigation.NavScreen

sealed class ItemsBotonNav(
    val icon: ImageVector,
    val title: String,
    val ruta: NavScreen,
){
    object ItemBottom_1: ItemsBotonNav(
        Icons.Outlined.AttachMoney,
        title = "Transferencias",
        NavScreen.TransferenciasScreen
    )

    object ItemBottom_2: ItemsBotonNav(
        Icons.Outlined.PriceCheck,
        title = "Pago de Servicios",
        NavScreen.PagarServiciosScreen
    )

    object ItemBottom_3: ItemsBotonNav(
        Icons.Outlined.CreditCard,
        title = "Pago de Tarjetas",
        NavScreen.PagarTarjetasScreen
    )

}

