package com.example.proyectoui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.proyectoui.ui.screen.detalleScreen.DetalleScreen
import com.example.proyectoui.ui.screen.homeScreen.HomeScreen
import com.example.proyectoui.ui.screen.loginScreen.LoginScreen

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen {
                navController.navigate(Home)
            }
        }
        composable<Home> {
            HomeScreen { nombre -> navController.navigate(Detalle(nombre)) }
        }
        composable<Detalle> { backStatEntry ->
            val detalle = backStatEntry.toRoute<Detalle>()
            DetalleScreen(
                detalle.nombre,
                { navController.popBackStack() },
                { navController.navigate(Login) {
                        popUpTo(Login) {
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}