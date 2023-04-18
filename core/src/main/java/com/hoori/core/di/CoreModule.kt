package com.hoori.core.di

import com.hoori.core.common.ResourceProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CoreModule {

    @Binds
    abstract fun bindResourceProvider(provider : ResourceProvider.Impl) : ResourceProvider
}
