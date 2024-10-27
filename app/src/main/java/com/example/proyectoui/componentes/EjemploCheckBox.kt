package com.example.proyectoui.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment


data class ItemCheckBox(
    val stateCheckBox: Boolean,
    val onCheckedChange: (Boolean) -> Unit,
    val texto: String
)

@Composable
fun MisCheckBox() {
    var checkedState by remember { mutableStateOf(false) }
    val listaItemCheckBox = getItemCheckBox()
    Column {
        listaItemCheckBox.forEach { itemCheckBox ->
            EjemploCheckBox(itemCheckBox)
        }
    }
}

@Composable
fun getItemCheckBox(): List<ItemCheckBox> {
    val listaTextCheckBox = listOf("Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4", "Opcion 5")
    var listaItemCheckBox = mutableListOf<ItemCheckBox>()
    listaTextCheckBox.forEach { texto ->
        var state by remember { mutableStateOf(false) }
        ItemCheckBox(
            state,
            { state = it },
            texto
        )
        listaItemCheckBox.add(ItemCheckBox(
            state,
            { state = it },
            texto
        ))
    }
    return listaItemCheckBox
}

@Composable
fun EjemploCheckBox(itemCheckBox: ItemCheckBox) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = itemCheckBox.stateCheckBox,
            onCheckedChange = { itemCheckBox.onCheckedChange(!itemCheckBox.stateCheckBox) },
        )
        Text(itemCheckBox.texto)
    }
}