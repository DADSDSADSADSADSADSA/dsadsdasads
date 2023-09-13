package com.example.myapplicationsdafdaasdfsd

import androidx.compose.runtime.Composable
import com.example.myapplicationsdafdaasdfsd.ui.MainScreen
import com.example.myapplicationsdafdaasdfsd.ui.NoteScreen

@Composable
fun Screen1(mainViewModel: MainViewModel, onClick: () -> Unit) {
    MainScreen(mainViewModel, onClick)
}

@Composable
fun Screen2(mainViewModel: MainViewModel) {
    NoteScreen(mainViewModel)
}