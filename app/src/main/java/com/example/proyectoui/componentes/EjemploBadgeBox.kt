package com.example.proyectoui.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EjemploBadgeBox() {
    BadgedBox(badge = {
            Badge(
                containerColor = Color.DarkGray,
                ) {
                Text(
                    "9",
                    color = Color.Yellow,
                )
            }
        }, modifier = Modifier
            .padding(16.dp)
            .background(Color.Cyan)) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home",
        )
    }
}