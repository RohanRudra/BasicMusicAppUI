package com.example.musicappui.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicappui.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home(){
    val categories = listOf("Hits","Happy","Workout","Devotional","Pop","Romantic")
    val grouped = listOf<String>("New Release","Favorites","India's Best","Top Rated").groupBy { it[0] }

    LazyColumn {
        grouped.forEach{
            stickyHeader { 
                Text(text = it.value[0], modifier = Modifier.padding(12.dp),
                    fontSize = 20.sp, fontWeight = FontWeight.SemiBold, fontStyle = FontStyle.Italic)

                LazyRow {
                    items(categories){
                        MusicItem(category = it, drawable = R.drawable.baseline_dashboard_24)
                    }
                }
            }
        }
    }
}

@Composable
fun MusicItem(category: String, drawable: Int){
    Card(modifier = Modifier
        .padding(16.dp)
        .size(200.dp),
        border = BorderStroke(2.dp, Color.DarkGray)){
        Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = category)
            Image(painter = painterResource(id = drawable), contentDescription = category)
        }
    }
}