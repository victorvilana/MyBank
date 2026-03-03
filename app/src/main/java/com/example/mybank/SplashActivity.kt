package com.example.mybank

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mybank.screens.SplashScreen
import com.example.mybank.ui.theme.MyBankTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyBankTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Card(
                        modifier = Modifier.padding(innerPadding)


                    ) {
                        SplashScreen()
                    }
                }
            }
        }
    }
}
