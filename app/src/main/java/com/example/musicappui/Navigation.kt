package com.example.musicappui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.musicappui.ui.theme.BrowseView
import com.example.musicappui.ui.theme.Home
import com.example.musicappui.ui.theme.Library

@Composable
fun Navigation(navController: NavController, viewModel: MainViewModel, pd: PaddingValues){
    NavHost(navController = navController as NavHostController, startDestination = Screen.DrawerScreen.Account.route){

        composable(Screen.DrawerScreen.Account.route){
            AccountView()
        }

        composable(Screen.DrawerScreen.Subscription.route){
            Subscription()
        }

        composable(Screen.BottomScreen.Home.bRoute){
            Home()
        }

        composable(Screen.BottomScreen.Browse.bRoute){
            BrowseView()
        }

        composable(Screen.BottomScreen.Library.bRoute){
            Library()
        }


    }
}