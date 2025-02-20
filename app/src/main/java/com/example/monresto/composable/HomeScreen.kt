package com.example.monresto.composable

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.monresto.data.DataService
import com.example.monresto.model.Menu

@Composable
fun HomeScreen(onClick: (Menu) -> Unit) {
    LazyColumn(
        content = {
            items(DataService().allMenu) { menu ->
                MenuView(menu = menu, onClick = { onClick(it) })
            }
        }
    )
}