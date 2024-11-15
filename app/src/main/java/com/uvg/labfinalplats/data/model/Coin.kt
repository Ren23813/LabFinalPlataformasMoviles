package com.uvg.labfinalplats.data.model


data class Coin(
    val id:String,
    val name: String,
    val symbol: String,
    val priceUSD:Float,
    val changePercentage:Float,
    val supply: Float,
    val maxSupply:Float,
    val marketCap:Float

)