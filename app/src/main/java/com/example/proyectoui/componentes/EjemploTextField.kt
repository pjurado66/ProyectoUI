package com.example.proyectoui.componentes

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun EjemploTextField() {
    TextField(
        value = "",
        onValueChange = { },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Yellow,
        ),
        enabled = true,
        label = { Text("Label") },
//        placeholder = { Text("Placeholder") }
    )
}

@Composable
fun EjemploOutlinedTextField() {
    OutlinedTextField(
        value = "",
        onValueChange = { },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Yellow,
        ),
        enabled = true,
        label = { Text("Label") },
//        placeholder = { Text("Placeholder") }
    )
}