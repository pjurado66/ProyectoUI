package com.example.proyectoui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SampleElevationState(){
    var texto by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        TextFieldYellow(texto) { textonuevo -> texto = textonuevo }
        Text(texto)
        Button(
            onClick = { texto = "" },
            enabled = texto.isNotEmpty()
        ) {
            Text("Borrar")
        }
    }
}

@Composable
fun TextFieldYellow(texto: String, onValueNew: (String) -> Unit){
    TextField(
        value = texto,
        onValueChange = { textonuevo -> onValueNew(textonuevo) },
        modifier = Modifier.padding(16.dp).background(Color.Yellow)
    )
}


@Composable
fun SampleState(){
    var texto by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        TextField(
            value = texto,
            onValueChange = { textonuevo -> texto = textonuevo },
            modifier = Modifier.padding(16.dp).background(Color.LightGray)
        )
        Text(texto)
        Button(
            onClick = { texto = "" },
            enabled = texto.isNotEmpty()
        ) {
            Text("Borrar")
        }
    }
}