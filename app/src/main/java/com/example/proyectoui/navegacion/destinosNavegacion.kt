package com.example.proyectoui.navegacion

import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Detalle(val nombre: String)