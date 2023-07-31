package com.shegs.trendmovies.model.repositories

import android.util.Log
import com.shegs.trendmovies.model.Movies
import com.shegs.trendmovies.model.network.RetrofitInstance

class MoviesRepository {
    private val moviesApi = RetrofitInstance.moviesApi

    suspend fun getPopularMovies(): List<Movies>{
        try {
            return moviesApi.getPopularMovies()
        } catch (e: Exception) {
            // Log any exceptions that occur during the API call
            Log.e("MoviesRepository", "Error fetching popular movies: ${e.message}", e)
            throw e // Re-throw the exception to propagate it if needed
        }
    }
}