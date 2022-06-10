package com.module.jetpack.compose.home.impl.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.module.jetpack.compose.home.impl.HomeViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
    onUserSelected: () -> Unit,
) {
    Box {
        HomeBody(onUserSelected)
    }
}

@Composable
fun HomeBody(onUserSelected: () -> Unit) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            onUserSelected.invoke()
        }) {
            Text(text = "Detail")
        }
    }
}