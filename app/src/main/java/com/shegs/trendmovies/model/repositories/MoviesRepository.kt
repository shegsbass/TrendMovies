package com.shegs.trendmovies.model.repositories

import com.shegs.trendmovies.model.Movies
import com.shegs.trendmovies.model.network.RetrofitInstance

class MoviesRepository {
    private val moviesApi = RetrofitInstance.moviesApi

    suspend fun getPopularMovies(): Movies {
        try {
            return moviesApi.getPopularMovies()
        } catch (e: Exception) {
            // Handle exceptions (e.g., network issues, parsing errors)
            throw e
        }
    }
}