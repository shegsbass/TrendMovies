package com.shegs.trendmovies.viewmodel

import com.shegs.trendmovies.model.Movies

sealed class MoviesState{
    object Loading: MoviesState()
    data class Success(val movies: Movies) : MoviesState()
    data class Error(val message: String) : MoviesState()
}
