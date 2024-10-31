package com.example.proyectoui.intentImplicita

import android.content.Context
import android.content.Intent

fun intentSend(context: Context) {
    val intent = Intent().apply{
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, "Hola desde mi app")
        type = "text/plain"
    }
    if(intent.resolveActivity(context.packageManager) != null){
        context.startActivity(intent)
    }
}