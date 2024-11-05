package com.example.proyectoui.ui.screen.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.proyectoui.scaffold.MyFloatingActionButton

@Composable
fun HomeScreen(navigateToDetalle: (String) -> Unit) {
    var nombre by remember { mutableStateOf("") }
    Scaffold (
        floatingActionButton = { MyFloatingActionButton(navigateToDetalle, nombre) }
    ){ paddingValue ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValue),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text("Home Screen", style = MaterialTheme.typography.displayMedium)
            Spacer(modifier = Modifier.weight(1f))
            TextField(
                value = nombre,
                onValueChange = { nombre = it },
            )
            Spacer(modifier = Modifier.weight(1f))
            Button(onClick = { navigateToDetalle(nombre) }) {
                Text("Detalle", style = MaterialTheme.typography.displaySmall)
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}


