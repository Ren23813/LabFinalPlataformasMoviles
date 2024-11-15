package com.uvg.labfinalplats.data.network.dto

import com.uvg.labfinalplats.data.model.Coin
import kotlinx.serialization.Serializable

@Serializable
data class EntryCoinDTO(
    val id:String,
    val name: String,
    val symbol: String,
    val priceUSD:Float,
    val changePercentage:Float,
    val supply: Float,
    val maxSupply:Float,
    val marketCap:Float
)

fun EntryCoinDTO.mapToModel():Coin{
    return Coin(
        id = id,
        name = name,
        symbol = symbol,
        priceUSD = priceUSD,
        changePercentage = changePercentage,
        supply = supply,
        maxSupply = maxSupply,
        marketCap = marketCap
    )
}



