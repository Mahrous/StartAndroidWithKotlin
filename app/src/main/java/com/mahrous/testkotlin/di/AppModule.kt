package com.mahrous.testkotlin.di

import com.mahrous.testkotlin.network.ArmorApi
import com.mahrous.testkotlin.network.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideArmorApi(remoteDataSource: RemoteDataSource): ArmorApi {
        return remoteDataSource.buildApi(ArmorApi::class.java)
    }


}