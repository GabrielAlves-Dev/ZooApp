package com.gabriel.zooapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gabriel.zooapp.models.animalList
import com.gabriel.zooapp.ui.screens.AnimalScreen
import com.gabriel.zooapp.ui.screens.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onAnimalSelected = { animal ->
                navController.navigate("animal/${animal.name}")
            })
        }
        composable("animal/{animalName}") { backStackEntry ->
            val animalName = backStackEntry.arguments?.getString("animalName")
            val selectedAnimal = animalList.first { it.name == animalName }
            AnimalScreen(selectedAnimal, navController)
        }
    }
}