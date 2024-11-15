package com.uvg.labfinalplats.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import com.uvg.labfinalplats.presentation.mainFlow.coinList.CoinListDESTINATION
import com.uvg.labfinalplats.presentation.mainFlow.coinList.CoinListScreen
import com.uvg.labfinalplats.presentation.mainFlow.coinList.coinListScreen
import com.uvg.labfinalplats.presentation.mainFlow.coinProfile.coinProfileScreen
import com.uvg.labfinalplats.presentation.mainFlow.coinProfile.navigateToCoinProfileScreen


@Composable
fun AppNavigation(navController:NavHostController= rememberNavController(),modifier: Modifier){

    NavHost(
    navController=navController,
    startDestination= CoinListDESTINATION)
    {
        coinListScreen(onCoinClick = navController::navigateToCoinProfileScreen)
        coinProfileScreen(onNavigateBack = navController::navigateUp)
    }


}