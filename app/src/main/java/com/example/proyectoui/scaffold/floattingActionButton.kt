package com.example.proyectoui.scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

@Composable
fun MyFloatingActionButton(navigateToDetalle: (String) -> Unit, nombre: String) {
    FloatingActionButton(
        onClick = {navigateToDetalle(nombre)}
    ) {
        Icon(imageVector = Icons.Default.Add, contentDescription = null)
    }
}