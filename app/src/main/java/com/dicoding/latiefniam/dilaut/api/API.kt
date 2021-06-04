package com.dicoding.latiefniam.dilaut.api


import com.dicoding.latiefniam.dilaut.fish.FishResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("api_predictFishPrices")
    //@Headers("Authorization: token ")
    fun getDataFish(@Query("q") query: String)
            : Call<FishResponse>
//    @GET("api_predictFishPrices")
//    //@Headers("Authorization: token ")
//    fun getDataFishDetail(@Query("q") query: String)
//            : Call<FishBaseDetail>


}