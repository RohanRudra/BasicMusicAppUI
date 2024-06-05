package com.example.musicappui.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.example.musicappui.R

@Composable
fun BrowseView(){
    val categories = listOf("Pop","Party","Hip-Hop","Classical","Travel","Love")

    LazyVerticalGrid(GridCells.Fixed(2)) {
        items(categories){
            MusicItem(category = it, drawable = R.drawable.baseline_dashboard_24)
        }
    }
}
