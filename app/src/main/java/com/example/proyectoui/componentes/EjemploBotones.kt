package com.example.proyectoui.componentes

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EjemploBotones() {
    Column() {

        Button(
            onClick = { Log.d("Botón", "Boton proimero") },

        ) {
            Row {
                Text("Mi botón")
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Localized description"
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedButton(
                    onClick = { Log.d("Botón", "Boton segundo") },

                    ) {
                    Text("Mi botón")
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        FilledTonalButton(
            onClick = { /* Do something! */ },

        ) {
            Text("Mi botón")
        }
        Spacer(modifier = Modifier.height(10.dp))
        ElevatedButton(
            onClick = { /* Do something! */ },

        ) {
            Text("Mi botón")
        }
    }
}