package com.mahrous.testkotlin.network

import com.mahrous.testkotlin.data.AmorResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface ArmorApi {

    @GET("armor")
    suspend fun getArmor(): ArrayList<AmorResponseItem>
}