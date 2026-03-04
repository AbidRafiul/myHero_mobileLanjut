package com.abid.myapplication

import com.google.gson.annotations.SerializedName

data class Character(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("birthdate")
	val birthdate: String? = null,

	@field:SerializedName("children")
	val children: List<String?>? = null,

	@field:SerializedName("nickname")
	val nickname: String? = null,

	@field:SerializedName("fullName")
	val fullName: String? = null,

	@field:SerializedName("index")
	val index: Int? = null,

	@field:SerializedName("hogwartsHouse")
	val hogwartsHouse: String? = null,

	@field:SerializedName("interpretedBy")
	val interpretedBy: String? = null
)
