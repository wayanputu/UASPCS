package com.wayanputu.api.api

import com.wayanputu.api.data.model.DetailUserResponse
import com.wayanputu.api.data.model.User
import com.wayanputu.api.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token e25ee146cb1964c68c31e66516e7b36aa820c03c")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token e25ee146cb1964c68c31e66516e7b36aa820c03c")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token e25ee146cb1964c68c31e66516e7b36aa820c03c")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token e25ee146cb1964c68c31e66516e7b36aa820c03c")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}