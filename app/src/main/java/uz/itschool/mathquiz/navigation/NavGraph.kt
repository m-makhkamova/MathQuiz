package uz.itschool.mathquiz.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import uz.itschool.mathquiz.screen.IntroScreen
import uz.itschool.mathquiz.screen.SplashScreen

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route)
    {
        composable(route = Screens.Splash.route){
            SplashScreen(navController)
        }
        composable(route = Screens.Intro.route){
            IntroScreen(navController)
        }

    }
}