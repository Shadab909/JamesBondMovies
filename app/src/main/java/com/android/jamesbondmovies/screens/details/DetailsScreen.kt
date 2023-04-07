package com.android.jamesbondmovies.screens.details

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.android.jamesbondmovies.R
import com.android.jamesbondmovies.model.BondMovie
import com.android.jamesbondmovies.model.movieList
import com.android.jamesbondmovies.widgets.DetailsScreenContent

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DetailsScreen(navController: NavController,movieId : Int) {

   val expectedMovieList : List<BondMovie> = movieList().filter {  bondMovie ->
      bondMovie.id == movieId
   }

   DetailsScreenContent(navController = navController, expectedMovieList = expectedMovieList)

}
