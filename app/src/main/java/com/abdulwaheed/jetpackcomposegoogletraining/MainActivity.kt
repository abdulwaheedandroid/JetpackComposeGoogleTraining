package com.abdulwaheed.jetpackcomposegoogletraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.abdulwaheed.jetpackcomposegoogletraining.ui.theme.JetPackComposeGoogleTrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeGoogleTrainingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        content = {
            Text(
                "First Colums",
                fontSize = 110.sp,
                lineHeight = 116.sp
            )

            Text("Second COlumn", fontSize = 36.sp)

        }
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeGoogleTrainingTheme {
        Greeting("Android")
    }
}