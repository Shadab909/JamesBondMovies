package com.android.jamesbondmovies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.android.jamesbondmovies.screens.details.DetailsScreen
import com.android.jamesbondmovies.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreen.HomeScreen.name ){
        composable(MovieScreen.HomeScreen.name){
            HomeScreen(navController = navController)
        }

        composable(
            MovieScreen.DetailsScreen.name + "/{movieId}",
            arguments = listOf(navArgument(name = "movieId") {
                type = NavType.IntType
            })
        ){ backStackEntry->
            backStackEntry.arguments?.let {
                DetailsScreen(
                    navController = navController,
                    it.getInt("movieId")
                )
            }
        }
    }
}