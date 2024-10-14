package com.example.proyectoui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.proyectoui.model.MediaItem
import com.example.proyectoui.model.Type

@Composable
fun ListaElementos() {
    val lista = getMedia()
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        //modifier = Modifier.fillMaxSize()
    ) {
        items(lista) { mediaItem ->
            Column(
                modifier = Modifier.width(200.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.Center,

                    ) {
                    AsyncImage(
                        model = mediaItem.photo,
                        contentDescription = null
                    )
                    if (mediaItem.tipo == Type.VIDEO) {
                        Icon(
                            imageVector = Icons.Default.ArrowRight,
                            contentDescription = "Video",
                            tint = Color.Red,
                            modifier = Modifier.size(150.dp)

                        )
                    }
                }

                Text(
                    text = mediaItem.title,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.background(Color.Cyan)

                )
            }
        }
    }
}


fun getMedia() = (1..100).map {
    MediaItem(
        id = it,
        title = "Titulo $it",
        photo = "https://loremflickr.com/400/400/seville?lock=$it",
        tipo = if (it % 3 == 0) Type.VIDEO else Type.FOTO
    )
}