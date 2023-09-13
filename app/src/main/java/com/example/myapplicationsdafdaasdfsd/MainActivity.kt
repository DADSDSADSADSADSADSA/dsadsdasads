package com.example.myapplicationsdafdaasdfsd

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplicationsdafdaasdfsd.ui.theme.MyApplicationSDAFDAASDFSDTheme
import com.example.myapplicationsdafdaasdfsd.ui.MainScreen
import com.example.myapplicationsdafdaasdfsd.ui.NoteScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mainViewModel: MainViewModel = viewModel(factory = MainViewModel.factory)
            val navController = rememberNavController()

            NavHost(navController=navController, startDestination ="screen_1")
            {
                composable("screen_1"){
                    Screen1(mainViewModel) {
                        navController.navigate("screen_2")
                    }

                }
                composable("screen_2"){
                    NoteScreen(mainViewModel)
                }
            }

        }
    }
}