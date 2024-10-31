package com.example.proyectoui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.proyectoui.navegacion.Navegacion
import com.example.proyectoui.ui.theme.ProyectoUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            ProyectoUITheme {
                Navegacion()
            }
        }
    }

}






