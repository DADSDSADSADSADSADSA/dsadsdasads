package com.example.myapplicationsdafdaasdfsd.ui

import android.content.Context
import android.graphics.drawable.shapes.Shape
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplicationsdafdaasdfsd.MainActivity
import com.example.myapplicationsdafdaasdfsd.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    mainViewModel: MainViewModel = viewModel(factory = MainViewModel.factory)
) {

    val itemsList = mainViewModel.itemsList.collectAsState(initial = emptyList())
    Scaffold(
        floatingActionButton = { MyFloatingActionButton() },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(android.graphics.Color.parseColor("#000000")))
                .padding(paddingValues)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(left = 15.dp, top = 25.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Все", color = Color.White, fontSize = 30.sp)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(left = 17.dp, bottom = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "7 заметок", color = Color(android.graphics.Color.parseColor("#787878")), fontSize = 15.sp)
            }
            Spacer(modifier = Modifier.height(5.dp))
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ){
                items(itemsList.value) { item ->
                    ListItem(
                        item,
                        {
                            mainViewModel.nameEntity = it
                            mainViewModel.newText.value = it.name
                        },
                        {
                            mainViewModel.deleteItem(it)
                        }
                    )
                }
            }
        }
    }

}

@Preview
@Composable
fun MyFloatingActionButton() {
    FloatingActionButton(onClick = { }, containerColor = Color(android.graphics.Color.parseColor("#3b7ffc")), shape = CircleShape) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Favorite FAB", tint = Color.White)
    }
}