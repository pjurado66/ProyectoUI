package com.example.proyectoui.model

data class CheckInfo(
    val title: String,
    val checked: Boolean,
    val onCheckedChange: (Boolean) -> Unit
)
