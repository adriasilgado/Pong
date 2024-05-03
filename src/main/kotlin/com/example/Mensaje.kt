package com.example

import kotlinx.serialization.Serializable
var mensajeGuardado : Mensaje? = null

@Serializable
data class Mensaje(
    val mensaje: String,
)