package com.abid.myapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface heroService {
    @GET(value="/api/heroes")
    fun getHeroes(): Call<List<hero>>

    @GET(value="/api/heroes")
    fun getHeroesByName(@Query(value="q") query:String):List<hero>
}

