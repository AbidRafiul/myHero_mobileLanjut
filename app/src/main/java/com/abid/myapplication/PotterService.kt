package com.abid.myapplication

import retrofit2.http.GET
import retrofit2.http.Path

interface PotterService {


    @GET("/{language}/characters")
    suspend fun getCharacters(@Path("language") bahasa: String = "en") : List<Character>


}