package com.mahrous.testkotlin.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RemoteDataSource @Inject constructor() {


    companion object {
        private const val BASE_URL = "https://mhw-db.com/"

    }

    fun <Api> buildApi(api: Class<Api>): Api {

        return Retrofit.Builder().client(getClient()).baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }

    private fun getClient(): OkHttpClient {
        val logger: HttpLoggingInterceptor = HttpLoggingInterceptor()
        logger.setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient.Builder().readTimeout(100, TimeUnit.SECONDS)
            .addInterceptor(logger)
            .writeTimeout(100, TimeUnit.SECONDS).retryOnConnectionFailure(false).build()
    }
}