package com.uvg.labfinalplats.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class EntryCoinListDTO(
val data:List<EntryCoinDTO>,
val message:String,
val status:Int
)

