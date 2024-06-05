package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val route: String) {

    sealed class BottomScreen(val bTitle: String, val bRoute: String, @DrawableRes val icon: Int)
        : Screen(bTitle, bRoute){
            object Home: BottomScreen("Home","home", R.drawable.baseline_music_video_24)
            object Library: BottomScreen("Library","library", R.drawable.baseline_library_music_24)
            object Browse: BottomScreen("Browse","browse", R.drawable.baseline_search_24)
        }

    sealed class DrawerScreen(val dTitle: String, val dRoute: String, @DrawableRes val icon: Int)
        : Screen(dTitle,dRoute){
            object Account: DrawerScreen("Account","account",R.drawable.ic_account)
            object Subscription: DrawerScreen("Subscription","subscription",R.drawable.ic_subscription)
            object AddAcount: DrawerScreen("Add Account","add_account",R.drawable.add_account)
        }
}

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAcount
)