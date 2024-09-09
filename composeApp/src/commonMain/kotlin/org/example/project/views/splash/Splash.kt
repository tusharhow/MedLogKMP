package org.example.project.views.splash

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlinx.coroutines.delay
import org.example.project.views.auth.LoginScreen

class Splash : Screen{
    @Composable
    override fun Content() {
        val navigate = LocalNavigator.currentOrThrow
        var startAnimation by remember { mutableStateOf(false) }
        val alphaAnim = animateFloatAsState(
            targetValue = if (startAnimation) 1f else 0f,
            animationSpec = tween(
                durationMillis = 3000
            ), label = ""
        )

        LaunchedEffect(key1 = true) {
            startAnimation = true
            delay(4000)
            navigate.popUntilRoot()
            navigate.push(LoginScreen())
        }
        SplashView(alpha = alphaAnim.value)
    }
}
