package com.example.monresto.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.monresto.data.DataService
import com.example.monresto.model.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    //Crea du navigationController
    val navigationController = rememberNavController()
    //Puisse voir sur quel menu nous sommes
    var menu by remember { mutableStateOf(DataService().americain) }
    //BackStackEntry
    val backStackEntry by navigationController.currentBackStackEntryAsState()
    //Ma screenActuelle
    val currentScreen = Screens.valueOf(backStackEntry?.destination?.route?: Screens.Home.title)

    Scaffold(
        topBar = { AppBar(
            screens = currentScreen,
            up = {navigationController.navigateUp() },
            canGoBack = navigationController.previousBackStackEntry != null
        ) },
        content = { paddingValues ->
            NavHost(
                navController = navigationController,
                startDestination = Screens.Home.name,
                modifier = Modifier.padding(paddingValues)
            ) {
                composable(route = Screens.Home.name) {
                    HomeScreen(onClick = { newMenu ->
                        println("Clicked")
                        menu = newMenu
                        navigationController.navigate(route = Screens.Entree.name)
                    } )
                }
                composable(route = Screens.Entree.name) {
                    DetailView(article = menu.entree, btnTitle = "Vers les plats", onClick = {
                        navigationController.navigate(route = Screens.Plat.name)
                    })
                }
                composable(route = Screens.Plat.name) {
                    DetailView(article = menu.plat, btnTitle = "Vers les Desserts", onClick = {
                        navigationController.navigate(route = Screens.Dessert.name)
                    })
                }
                composable(route = Screens.Dessert.name) {
                    DetailView(article = menu.dessert, btnTitle = "Retour aux menus", onClick =  {
                        navigationController.popBackStack(Screens.Home.name, inclusive = false)
                    })
                }
            }
        }
    )
}
