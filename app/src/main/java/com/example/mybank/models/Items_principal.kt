package com.example.mybank.models

sealed class Items_principal (
    var image: Int?,
    var title: String?,
    var details: String?,

    ){
    object Items_principal1: Items_principal(
        null,
        "Cuentas",
        "Detalle cuentas 1"
    )

    object Items_principal2: Items_principal(
        null,
        "Tarjetas de crédito",
        "Detalle tarjetas 1"
    )
    object Items_principal3: Items_principal(
        null,
        "Recompensas",
        "Recompensar 1"
    )

    object Items_principal4: Items_principal(
        null,
        "Inversiones",
        "Inversiones 1"
    )

    object Items_principal5: Items_principal(
        null,
        "Créditos",
        "Créditos 1"
    )

}

