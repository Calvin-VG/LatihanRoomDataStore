package com.example.latihanroomdatastore.api

import com.example.latihanroomdatastore.UserResponseItem
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @POST("user")
    @FormUrlEncoded
    fun registerUser(
        @Field("email")email : String,
        @Field("password")password : String,
        @Field("username")username : String,
    ): Call<UserResponseItem>

}