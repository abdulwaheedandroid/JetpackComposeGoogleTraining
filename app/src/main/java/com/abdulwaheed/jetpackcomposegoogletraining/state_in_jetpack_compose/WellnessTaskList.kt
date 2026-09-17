package com.abdulwaheed.jetpackcomposegoogletraining.state_in_jetpack_compose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

fun getWellnessTask() =
    List(30) { i ->
        WellnessTask(i, "Task # $i")
    }


@Composable
fun WellnessTaskList (
    list: List<WellnessTask> = remember { getWellnessTask() },
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(list.size) { task ->
            WellnessTaskItem(taskName = list[task].label)
        }
    }
}