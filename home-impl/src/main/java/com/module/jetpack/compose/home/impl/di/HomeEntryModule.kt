package com.module.jetpack.compose.home.impl.di

import com.module.jetpack.compose.common.FeatureEntry
import com.module.jetpack.compose.common.di.FeatureEntryKey
import com.module.jetpack.compose.home.api.HomeEntry
import com.module.jetpack.compose.home.impl.HomeEntryImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface HomeEntryModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(HomeEntry::class)
    fun imagesEntry(entry: HomeEntryImpl): FeatureEntry
}