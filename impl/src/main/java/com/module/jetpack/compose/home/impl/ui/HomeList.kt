package com.module.jetpack.compose.home.impl.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.module.jetpack.compose.home.impl.HomeViewModel

@Composable
inline fun HomeScreen(
    viewModel: HomeViewModel,
    crossinline onUserSelected: (userId: String) -> Unit
) {
    Box {
        Empty()
    }
}

@Composable
fun Empty() {

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Home",
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 30.dp)
        )
    }
}