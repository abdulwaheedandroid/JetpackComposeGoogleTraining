package com.abdulwaheed.jetpackcomposegoogletraining.jetpackcomposeforandroiddeveloper

import android.R.attr.name
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abdulwaheed.jetpackcomposegoogletraining.ui.theme.JetPackComposeGoogleTrainingTheme
import java.nio.file.WatchEvent

class BasicCodeLab : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeGoogleTrainingTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    Row {
                        Column(modifier = Modifier.padding(vertical = 4.dp)) {
                            val names: List<String> = mutableListOf("World", "Compose")
                            for (name in names) {
                                Greeting(name = name)
                            }
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val expanded = remember {mutableStateOf(false)}
    val extraPadding = if (expanded.value) 48.dp else 0.dp
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row (modifier = Modifier.padding(24.dp)){
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = extraPadding)

            ) {
                Text("Hello, $name")
            }

            OutlinedButton(onClick = {expanded.value = !expanded.value}) {
                Text(if (expanded.value) "Show less" else "Show more")
            }
        }
    }
}