package com.shegs.trendmovies.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shegs.trendmovies.model.repositories.MoviesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel(){
    private val moviesRepository = MoviesRepository()

    private val _moviesState = MutableStateFlow<MoviesState>(MoviesState.Loading)
    val moviesState: StateFlow<MoviesState> = _moviesState

    init {
        fetchPopularMovies()
    }

    private fun fetchPopularMovies() {
        viewModelScope.launch {
            try {
                val movies = moviesRepository.getPopularMovies()
                _moviesState.value = MoviesState.Success(movies)
            }catch (e: Exception){
                _moviesState.value = MoviesState.Error("Error Fetching Movies: $(e.message)")
            }
        }

    }


}