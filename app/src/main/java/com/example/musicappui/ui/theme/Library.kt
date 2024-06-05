package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicappui.Lib
import com.example.musicappui.libraries

@Composable
fun Library(){
    LazyColumn {
        items(libraries){
            libItem(lib = it)
        }
    }
}

@Composable
fun libItem(lib : Lib){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(13.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Row {
            Icon(painter = painterResource(id = lib.icon), contentDescription = lib.name,
                modifier = Modifier.padding(horizontal = 6.dp))
            Text(text = lib.name, modifier = Modifier.padding(top = 3.dp))
        }
        Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null)
    }
    Divider()
}