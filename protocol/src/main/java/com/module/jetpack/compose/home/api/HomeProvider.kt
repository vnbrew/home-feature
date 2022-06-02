package com.module.jetpack.compose.home.api

import androidx.compose.runtime.compositionLocalOf

interface HomeProvider

val LocalHomeProvider = compositionLocalOf<HomeProvider> {
    error("No home provider found!")
}