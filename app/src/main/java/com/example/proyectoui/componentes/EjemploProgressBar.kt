package com.example.proyectoui.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EjemploProgressBar() {
    Column {
        LinearProgressIndicator(
            color = Color.Green,
            trackColor = Color.Red
        )
        CircularProgressIndicator(strokeWidth = 10.dp)
    }

}