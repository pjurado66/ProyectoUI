package com.example.proyectoui.ui.screen.detalleScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun DetalleScreen(
    nombre: String,
    navigateToBack: () -> Unit,
    navigateToLogin: () -> Unit
) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.weight(1f))
        Text("Detalle Screen $nombre", style = MaterialTheme.typography.displayMedium)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {navigateToBack()}) {
            Text("Ir atrás", style = MaterialTheme.typography.displaySmall)
        }
        Button(onClick = {}) {
            Text("Ir ajustes", style = MaterialTheme.typography.displaySmall)
        }
        Button(onClick = {navigateToLogin()}) {
            Text("Logout", style = MaterialTheme.typography.displaySmall)
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}