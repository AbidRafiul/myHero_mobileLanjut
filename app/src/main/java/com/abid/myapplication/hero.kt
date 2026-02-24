package com.abid.myapplication

import com.google.gson.annotations.SerializedName

data class hero(
    val name: String,
    @SerializedName(value ="birth_year") val birth_year: Any,
    @SerializedName(value = "death_year")  val death_year: String,
    val description: String,
    @SerializedName(value = "ascension_yaer") val ascension_year: Int
)
