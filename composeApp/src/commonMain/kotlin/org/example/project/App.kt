package org.example.project


import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.example.project.views.splash.Splash

@Composable
fun App() {
    MaterialTheme {
      Navigator(Splash()) {navigator: Navigator ->
          SlideTransition(navigator = navigator)
      }
    }
}



