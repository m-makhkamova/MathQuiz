package uz.itschool.mathquiz.navigation

sealed class Screens(val route:String) {
    object Splash:Screens("splash_screen")
    object Intro:Screens("intro_screen")
    object Levels:Screens("levels_screen")
    object Quiz:Screens("quiz_screen")
}