package com.example.myapplicationsdafdaasdfsd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplicationsdafdaasdfsd.ui.main.MainScreen
import com.example.myapplicationsdafdaasdfsd.ui.NoteScreen
import com.example.myapplicationsdafdaasdfsd.ui.main.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mainViewModel: MainViewModel = viewModel(factory = MainViewModel.factory)
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Screens.Main.route) {
                composable(Screens.Main.route) {
                    MainScreen(mainViewModel, navController)
                }
                composable(Screens.Note.route) {
                    NoteScreen(mainViewModel)
                }
            }
        }
    }
}