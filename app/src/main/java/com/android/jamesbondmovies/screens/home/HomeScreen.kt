package com.android.jamesbondmovies.screens.home


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.android.jamesbondmovies.model.BondMovie
import com.android.jamesbondmovies.model.movieList
import com.android.jamesbondmovies.navigation.MovieScreen
import com.android.jamesbondmovies.widgets.MovieRow


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(navController: NavController , movieList : List<BondMovie> = movieList()) {

    val state = rememberLazyListState()
    
    LazyColumn(
        state = state,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(color = MaterialTheme.colors.background)
    ){
        
        stickyHeader {
            Card(
                backgroundColor = MaterialTheme.colors.primary,
                modifier = Modifier
                    .fillMaxWidth(),
                elevation = 8.dp,
                shape = RoundedCornerShape(bottomEnd = 16.dp, bottomStart = 16.dp)
            ) {
                Text(
                    text = "Bond Movies",
                    fontWeight = FontWeight.Bold,
                    fontSize = 50.sp,
                    fontFamily = FontFamily.Default,
                    color = Color(0xFFFAE7B5),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }

        items(items = movieList) { movie ->
            MovieRow(movie){
                navController.navigate(MovieScreen.DetailsScreen.name+"/${movie.id}")
            }
        }
    }

    
}





