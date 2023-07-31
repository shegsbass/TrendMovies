package com.shegs.trendmovies.model.network

import com.shegs.trendmovies.model.Movies
import retrofit2.http.GET

interface MoviesServiceInterface {

    @GET("popular?api_key=48520519ae82bbf0b9eca64552cd266a")
    suspend fun getPopularMovies(): List<Movies>
}