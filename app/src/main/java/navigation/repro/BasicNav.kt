package navigation.repro

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation

@Composable
fun BasicNav() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Blue"
    ) {
        composable(
            "Blue",
        ) { BlueScreen(navController) }
        composable(
            "Red",

            ) { RedScreen(navController) }
        navigation(
            startDestination = "Green",
            route = "Inner",
        ) {
            composable(
                "Green",
            ) { GreenScreen(navController) }
        }
    }
}
