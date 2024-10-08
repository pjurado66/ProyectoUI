package com.example.proyectoui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.example.proyectoui.model.MediaItem
import com.example.proyectoui.model.Type
import com.example.proyectoui.ui.theme.ProyectoUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            ProyectoUITheme {
                ListaElementos()
            }
        }
    }
}

@Composable
fun Imagenes() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        AsyncImage(
            model = "https://loremflickr.com/400/400/seville?lock=1",
            contentDescription = "Seville",
        )

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://loremflickr.com/400/400/seville?lock=2")
                .transformations(CircleCropTransformation())
                .crossfade(2000)
                .build(),
            contentDescription = "Seville",
        )

        AsyncImage(
            model = "https://loremflickr.com/400/400/seville?lock=3",
            contentDescription = "Seville",
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(RoundedCornerShape(8.dp))
        )

        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home",
            tint = Color.Red,
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.CenterHorizontally)
        )

        Image(
            painterResource(id = R.drawable.descarga),
            contentDescription = "Home",
        )

        Image(
            painterResource(id = R.drawable.instagram_icon),
            contentDescription = "Home",
        )

        val sw = true

        TextField(
            value = "",
            onValueChange = { },
            label = { Text("Label") },
            visualTransformation = if (sw) PasswordVisualTransformation() else VisualTransformation.None,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)


        )
    }
}


@Composable
fun ListaElementos() {
    val lista = getMedia()
    LazyVerticalGrid (
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

