package com.example.mybank.screens

import android.content.Intent
import android.graphics.Paint
import android.util.Log
import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.app.NotificationCompat
import com.example.mybank.MainActivity
import com.example.mybank.R
import kotlinx.coroutines.delay


@Composable
fun SplashScreen() {
    val context = LocalContext.current

    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(true) {
        scale.animateTo(
            0.9f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(8f).getInterpolation(it)
                }
            )
            )

        //delay(2000)
        //val intent = Intent(context, MainActivity::class.java)
        //context.startActivity(intent)
    }


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
            .scale(scale.value)
    ) {
        Image(
            painter = painterResource(id = R.drawable.la_banca_movil),
            contentDescription = "Logo del Banco"
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("Bienvenido",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(
            onClick = {
                Log.d("SplashScreen", "Clic en continuar")
                val intent = Intent(context, MainActivity::class.java)
                context.startActivity(intent)
            }
        ) {
            Text("Continuar", style = MaterialTheme.typography.bodyLarge)


        }


    }

}

