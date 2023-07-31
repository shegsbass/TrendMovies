package com.shegs.trendmovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.shegs.trendmovies.view.theme.TrendMoviesTheme
import com.shegs.trendmovies.view.ui.MoviesScreen
import com.shegs.trendmovies.viewmodel.MoviesViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrendMoviesTheme {
                MoviesScreen(MoviesViewModel())
            }
        }
    }
}
