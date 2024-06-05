package com.example.musicappui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun Subscription(){
    Column {
        Text(text = "Manage Subscription", modifier = Modifier.align(Alignment.CenterHorizontally))

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(9.dp), elevation = 8.dp) {

            Column {

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(9.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                    Column {
                        Text(text = "Musical", modifier = Modifier.padding(bottom = 5.dp))
                        Text(text = "Free Plan")
                    }

                    TextButton(onClick = { /*TODO*/ }) {
                        Row(modifier = Modifier.padding(top = 8.dp)) {
                            Text(text = "See All Plans", color = colorResource(id = R.color.purple_500) ,modifier = Modifier.padding(end = 2.dp, top = 4.dp))
                            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                contentDescription = null, modifier = Modifier.padding(end = 8.dp),
                                tint = colorResource(id = R.color.purple_500))
                        }
                    }
                }

                Divider(modifier = Modifier.padding(horizontal = 30.dp, vertical = 5.dp))

                Row(modifier = Modifier.padding(9.dp)) {
                    Icon(imageVector = Icons.Default.AccountBox, contentDescription = null, modifier = Modifier.padding(end = 5.dp))
                    Text(text = "Get a Plan", modifier = Modifier.padding(top = 4.dp))
                }

            }

        }
    }
}