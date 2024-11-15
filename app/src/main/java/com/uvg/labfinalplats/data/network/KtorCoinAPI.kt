package com.uvg.labfinalplats.data.network

import com.uvg.labfinalplats.data.network.dto.EntryCoinDTO
import com.uvg.labfinalplats.data.network.dto.EntryCoinListDTO
import com.uvg.labfinalplats.data.network.dto.EntryCoinProfileDTO
import com.uvg.labfinalplats.data.network.util.safeCall
import com.uvg.labfinalplats.repositories.network.CoinAPI
import com.uvg.labfinalplats.repositories.network.util.NetworkError
import com.uvg.labfinalplats.repositories.network.util.Result
import io.ktor.client.HttpClient
import io.ktor.client.request.get


class KtorCoinAPI(
    private val httpClient: HttpClient
): CoinAPI {

    override suspend fun getAllCoins(): Result<EntryCoinListDTO, NetworkError> {
            return safeCall<EntryCoinListDTO> {
                httpClient.get(
                    "api.coincap.io/v2/assets"
    )
}    }

    override suspend fun getCoinByID(id:String): Result<EntryCoinProfileDTO, NetworkError> {
        return safeCall<EntryCoinProfileDTO> {
            httpClient.get(
                "api.coincap.io/v2/assets/$id"
            ) }}


//
//    override suspend fun getCoinById: Result<EntryCoinProfileDTO, NetworkError> {
//        return safeCall<EntryCoinProfileDTO> {
//            httpClient.get(
//                "api.coincap.io/v2/assets/"
//            )
//        }
//    }
}