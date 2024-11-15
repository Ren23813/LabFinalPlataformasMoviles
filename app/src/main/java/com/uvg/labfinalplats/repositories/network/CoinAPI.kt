package com.uvg.labfinalplats.repositories.network

import com.uvg.labfinalplats.data.network.dto.EntryCoinListDTO
import com.uvg.labfinalplats.data.network.dto.EntryCoinProfileDTO
import com.uvg.labfinalplats.repositories.network.util.NetworkError
import com.uvg.labfinalplats.repositories.network.util.Result

interface CoinAPI{
suspend fun getAllCoins(): Result<EntryCoinListDTO,NetworkError>
suspend fun getCoinByID(): Result<EntryCoinProfileDTO,NetworkError>

}

