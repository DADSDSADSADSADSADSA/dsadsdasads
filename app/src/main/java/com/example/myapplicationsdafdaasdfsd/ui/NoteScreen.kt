package com.example.myapplicationsdafdaasdfsd.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplicationsdafdaasdfsd.ui.main.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
    mainViewModel: MainViewModel = viewModel(factory = MainViewModel.factory)
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#000000")))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .absolutePadding(left = 15.dp, top = 25.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text="ТЫ ЛОХ. И КЕНТЫ ТВОИ ТАКИЕ ЖЕ")
        }
    }
}