package com.uvg.labfinalplats.presentation.mainFlow.coinList

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object CoinListDESTINATION

fun NavGraphBuilder.coinListScreen(
onCoinClick:(Int)-> Unit){
composable <CoinListDESTINATION>{
CoinListRoute(onCoinClick= onCoinClick)
}
}