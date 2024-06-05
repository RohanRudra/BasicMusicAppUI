package com.example.musicappui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun AccountView(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
        ){
            Row(){
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Account",
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .width(30.dp)
                        .aspectRatio(1f))
                Column {
                    Text(text = "Rohan Tutorials")
                    Text(text = "@rohanrudra")
                }
            }
            
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null)
            }
        }

        Row(modifier = Modifier.padding(top = 15.dp, bottom = 7.dp)) {
            Icon(painter = painterResource(id = R.drawable.music),
                contentDescription = "My Music",
                modifier = Modifier
                    .padding(end = 15.dp)
                    .width(20.dp)
                    .aspectRatio(1f))
            Text(text = "My Music")
        }

        Divider()
    }
}