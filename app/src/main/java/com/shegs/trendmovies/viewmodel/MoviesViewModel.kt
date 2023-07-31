package com.shegs.trendmovies.viewmodel

import androidx.lifecycle.ViewModel
import com.shegs.trendmovies.model.repositories.MoviesRepository
import kotlinx.coroutines.flow.MutableStateFlow

class MoviesViewModel : ViewModel(){
    private val moviesRepository = MoviesRepository()

    private val _movies = MutableStateFlow()


}