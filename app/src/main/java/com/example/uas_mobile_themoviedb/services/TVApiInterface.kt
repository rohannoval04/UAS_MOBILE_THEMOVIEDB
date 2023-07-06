package com.example.uas_mobile_themoviedb.services

import com.example.uas_mobile_themoviedb.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=90815fba49dc64faccc22cbef96a0934")
    fun getTVList(): Call<TVResponse>
}