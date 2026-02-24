package com.abid.myapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitAPI {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://indonesia-public-static-api.vercel.app/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: heroService = retrofit.create<heroService?>(heroService::class.java)

}