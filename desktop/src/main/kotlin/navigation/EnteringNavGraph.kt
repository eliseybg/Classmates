package navigation

import androidx.compose.runtime.Composable
import navigation.component.NavHost
import navigation.component.NavHostController
import presentation.screens.home_screen.HomeScreen
import presentation.screens.login_screen.LoginScreen
import presentation.screens.splash_screen.SplashScreen

@Composable
fun EnteringNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }
    }
}
