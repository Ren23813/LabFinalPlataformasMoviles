package com.uvg.labfinalplats.presentation.mainFlow.coinProfile

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data class CoinProfileDESTINATION(
    val coinID:Int
)
    fun NavController.navigateToCoinProfileScreen(
coinID: Int,
navOptions: NavOptions? = null
    ){
        this.navigate(
            route =CoinProfileDESTINATION(coinID=coinID),
            navOptions = navOptions
        )
    }

fun NavGraphBuilder.coinProfileScreen(
    onNavigateBack: ()-> Unit
){
    composable<CoinProfileDESTINATION>{
CoinProfileRoute(onNavigateBack = onNavigateBack)
    }
}
