package org.example.project


import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.example.project.auth.LoginScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
      Navigator(LoginScreen()){navigator: Navigator ->
          SlideTransition(navigator = navigator)
      }
    }
}



