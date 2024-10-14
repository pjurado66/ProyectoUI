package com.example.proyectoui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
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
