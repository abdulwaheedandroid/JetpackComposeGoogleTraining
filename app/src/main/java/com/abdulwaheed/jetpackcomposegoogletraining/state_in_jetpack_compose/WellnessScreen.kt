package com.abdulwaheed.jetpackcomposegoogletraining.state_in_jetpack_compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(
    wellnessViewModel: WellnessViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    StatefulCounter(modifier)

    val list = remember { wellnessViewModel.getWellnessTasks().toMutableStateList() }
    WellnessTasksList(
        list = wellnessViewModel.tasks,
        onCheckedTask = { task, checked ->
            wellnessViewModel.changeTaskChecked(task, checked)
        },
        onCloseTask = { task ->
            wellnessViewModel.remove(task)
        }
    )
}
