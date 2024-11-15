package com.uvg.labfinalplats.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class EntryCoinProfileDTO(
val data:EntryCoinDTO,
val message:String,
val status: Int
)