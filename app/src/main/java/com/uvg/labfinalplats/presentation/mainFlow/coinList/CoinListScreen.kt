package com.uvg.labfinalplats.presentation.mainFlow.coinList

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CoinListRoute(
onCoinClick: (Int)->Unit, //viewmodel TODO
){
CoinListScreen(onCoinClick=onCoinClick)
}


@Composable
fun CoinListScreen(onCoinClick: (Int) -> Unit){
LazyColumn (modifier = Modifier
    .fillMaxSize()
    .background(color = MaterialTheme.colorScheme.primary), verticalArrangement = Arrangement.SpaceEvenly) {
items(25){ item ->
CoinItem_List( onCoinClick)
}
}
}


@Composable
fun CoinItem_List(onCoinClick: (Int) -> Unit){
    Spacer(modifier = Modifier.height(5.dp))
    Column (modifier = Modifier.clickable { onCoinClick(2) }){
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            //.clickable { onCoinClick(2) }, //ID especifico
            ,horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically)
        {
            Text(text = "Nombre: ", color = MaterialTheme.colorScheme.onPrimaryContainer, modifier = Modifier.weight(0.2f))
            Text(text = "Simbolo: ", color = MaterialTheme.colorScheme.onPrimaryContainer, modifier = Modifier.weight(0.2f))
            Text(text = "Precio USD: ", color = MaterialTheme.colorScheme.onPrimaryContainer, modifier = Modifier.weight(0.2f))
            Text(text = "Cambio %: ", color = MaterialTheme.colorScheme.onPrimaryContainer, modifier = Modifier.weight(0.2f))
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(30.dp)
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            .padding(5.dp)
            //.clickable { onCoinClick(2) }, //ID especifico
            ,horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically)
        {
            Text(text = "Bitcoin ", color = MaterialTheme.colorScheme.onPrimaryContainer, modifier = Modifier.weight(0.2f), fontWeight = FontWeight.Bold)
            Text(text = "BTC ", color = MaterialTheme.colorScheme.onPrimaryContainer, modifier = Modifier.weight(0.2f), fontStyle = FontStyle.Italic)
            Text(text = "999 ", color = MaterialTheme.colorScheme.onPrimaryContainer, modifier = Modifier.weight(0.2f))
            Text(text = "5 ", color = MaterialTheme.colorScheme.onPrimaryContainer, modifier = Modifier.weight(0.2f))
            Spacer(modifier = Modifier.height(12.dp))
        }

    }
}