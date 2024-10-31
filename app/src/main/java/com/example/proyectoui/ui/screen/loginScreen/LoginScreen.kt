package com.example.proyectoui.ui.screen.loginScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(navigateToHome: () -> Unit) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.weight(1f))
        Text("Login Screen", style = MaterialTheme.typography.displayMedium)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {navigateToHome()}) {
            Text("Login", style = MaterialTheme.typography.displaySmall)
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}