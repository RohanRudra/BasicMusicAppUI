package com.example.musicappui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    //keeping first screen as Add Account
    private val _currentScreen : MutableState<Screen> = mutableStateOf(Screen.DrawerScreen.AddAcount)

    val currentScreen: MutableState<Screen> = _currentScreen

    fun setCurrentScreen(screen : Screen){
        _currentScreen.value = screen
    }
}