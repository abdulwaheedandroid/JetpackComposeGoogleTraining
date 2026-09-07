package com.abdulwaheed.jetpackcomposegoogletraining.jetpackcomposeforandroiddeveloper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abdulwaheed.jetpackcomposegoogletraining.ui.theme.JetPackComposeGoogleTrainingTheme

class BasicCodeLab : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeGoogleTrainingTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    Greeting(name = "Android")
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colorScheme.primary) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
    }
}