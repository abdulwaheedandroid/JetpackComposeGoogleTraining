package com.abdulwaheed.jetpackcomposegoogletraining.state_in_jetpack_compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    StatefulCounter(modifier)

    val list = remember { getWellnessTasks().toMutableStateList() }
    WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }