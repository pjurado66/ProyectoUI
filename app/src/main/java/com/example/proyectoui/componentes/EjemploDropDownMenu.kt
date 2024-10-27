package com.example.proyectoui.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EjemploDropDownMenu() {
    var selectText by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val choices = listOf("Choice 1", "Choice 2", "Choice 3", "Choice 4")
    Column(Modifier.padding(20.dp)) {
        Box {
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Open Dropdown",
                modifier = Modifier
                    .size(50.dp)
                    .align(Alignment.CenterEnd)
            )
            OutlinedTextField(
                value = selectText,
                onValueChange = { /*selectText = it*/ },
                enabled = false,
                readOnly = true,
                modifier = Modifier
                    .clickable { expanded = true }
                    .fillMaxWidth()
            )
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
        ) {
            choices.forEach { text ->
                DropdownMenuItem(
                    text = { Text(text) },
                    onClick = {
                        selectText = text
                        expanded = false
                    }
                )
            }
        }
    }
    }