package com.example.mybank.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mybank.models.Items_principal

@Composable
fun HomeScreen() {
    val lista_items_principal = listOf(
        Items_principal.Items_principal1,
        Items_principal.Items_principal2,
        Items_principal.Items_principal3,
        Items_principal.Items_principal4,
        Items_principal.Items_principal5,

    )
    LazyColumn( modifier = Modifier.padding(16.dp)
    ) {
        items(lista_items_principal) {item ->
            //Spacer(modifier = Modifier.height(16.dp))
            ListItemRow(item)
            HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        }
    }
}

@Composable
fun ListItemRow (item: Items_principal) {
    var masInfo = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.padding(vertical = 8.dp)
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    delayMillis = 0,
                    LinearEasing
                    )
            )

    ) {


        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            item.title?.let {
                Text(
                    text = it,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .weight(1f)
                )
                IconButton(onClick = { masInfo.value = !masInfo.value }) {
                    Icon(
                        if (masInfo.value) Icons.Default.Remove
                        else Icons.Default.Add,
                        contentDescription = "Más información"
                    )
                }
            }
        }
        Row(){
            if (masInfo.value)
            Row{
                item.details?.let { Text(text = it, fontSize = 14.sp) }
            }

        }
    }


}