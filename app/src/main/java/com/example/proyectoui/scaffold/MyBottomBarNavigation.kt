package com.example.proyectoui.scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCard
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.SelectableDates
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun MyBottomBarNavigation () {
    var seleccionado by remember { mutableStateOf(0) }
    val itemsMenu = listOf(
        Item("Home", Icons.Default.Home, { seleccionado = 0 }, seleccionado == 0),
        Item("Tarjeta", Icons.Default.AddCard, { seleccionado = 1 }, seleccionado == 1),
        Item("Lista", Icons.Default.List, { seleccionado = 2 }, seleccionado == 2)
    )
    BottomAppBar {
        NavigationBar {
            itemsMenu.forEach { item ->
                NavigationBarItem(
                    icon = { Icon(item.icon, contentDescription = null) },
                    label = { Text(item.label) },
                    onClick = { item.onClick() },
                    selected = item.selected
                )

            }
        }
    }
}
data class Item(
    val label: String,
    val icon: ImageVector,
    val onClick: () -> Unit,
    val selected: Boolean
)
