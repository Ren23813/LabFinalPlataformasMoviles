package com.uvg.labfinalplats.presentation.mainFlow.coinProfile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.unit.dp

@Composable
fun CoinProfileRoute(
    onNavigateBack: ()->Unit
    //viewmodel TODO
){

    CoinProfileScreen(
onNavigateBack = onNavigateBack,
        modifier = Modifier.fillMaxSize()

    )
}

@Composable
fun CoinProfileScreen(onNavigateBack: () -> Unit, modifier:Modifier = Modifier ){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.secondaryContainer)) {
        CoinItem_Profile()

    }
}


@Composable
fun CoinItem_Profile(){
    Row (modifier = Modifier.fillMaxSize().padding(35.dp), horizontalArrangement = Arrangement.SpaceEvenly){
        Column(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .weight(0.5f),
            verticalArrangement = Arrangement.SpaceEvenly)
        {
            Text(text = "Nombre")
            Text(text = "Simbolo")
            Text(text = "Precio USD")
            Text(text = "Cambio porcentual")
            Text(text = "Supply")
            Text(text = "Supply máximo")
            Text(text = "Maket Cap (USD): ")
            Text(text = "Fecha: ")
        }
        Column(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .weight(0.5f),
            verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.End)
        {
            Text(text = "Bitcoin")
            Text(text = "BTC")
            Text(text = "999")
            Text(text = "5")
            Text(text = "320")
            Text(text = "657")
            Text(text = "5 ")
            Text(text = "12:10")
        }

    }
}

