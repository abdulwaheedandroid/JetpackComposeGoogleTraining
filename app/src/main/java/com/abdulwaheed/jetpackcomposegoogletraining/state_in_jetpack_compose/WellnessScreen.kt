package com.abdulwaheed.jetpackcomposegoogletraining.state_in_jetpack_compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    StatefulCounter(modifier)
    WellnessTaskList()
}