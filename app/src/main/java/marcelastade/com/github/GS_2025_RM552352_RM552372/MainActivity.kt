package marcelastade.com.github.GS_2025_RM552352_RM552372

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import marcelastade.com.github.GS_2025_RM552352_RM552372.screens.LoginScreen
import marcelastade.com.github.GS_2025_RM552352_RM552372.screens.MenuScreen
import marcelastade.com.github.GS_2025_RM552352_RM552372.screens.IMCScreen
import marcelastade.com.github.GS_2025_RM552352_RM552372.screens.EquipeScreen
import marcelastade.com.github.GS_2025_RM552352_RM552372.ui.theme.GS2_2025_RM552352_RM552372Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GS2_2025_RM552352_RM552372Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ) {
                        composable(route = "login") {
                            LoginScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "menu") {
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(
                            route = "imc",
                        ) {
                            IMCScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(
                            route = "equipe",
                        ) {
                            EquipeScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                    }
                }
            }
        }
    }
}