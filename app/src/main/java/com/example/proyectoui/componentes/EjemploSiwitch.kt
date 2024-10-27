package com.example.proyectoui.componentes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun EjemploSwitch() {
    var switchState by remember { mutableStateOf(true) }
    Switch(
        checked = switchState,
        onCheckedChange = { switchState = !switchState },
        thumbContent = {
            if (switchState) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Localized description"
                )
            }
        },
    )
}