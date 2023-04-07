package com.android.jamesbondmovies.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.android.jamesbondmovies.R
import com.android.jamesbondmovies.model.BondMovie

@Composable
fun MovieRow(movie: BondMovie , onItemClicked : (String) -> Unit) {
    Card(
        modifier = Modifier.padding(12.dp),
        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 4.dp
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(12.dp)
        ) {
            Surface(
                modifier = Modifier
                    .size(width = 100.dp, height = 132.dp)
                    .padding(4.dp)
                    .clip(shape = RoundedCornerShape(corner = CornerSize(8.dp))),
            ) {
                Image(
                    painter = painterResource(id = movie.image),
                    contentDescription = "Movie Image"
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, top = 4.dp, bottom = 4.dp)
                    .weight(1f)
            ) {
                Text(text = movie.title, style = MaterialTheme.typography.h5)
                Text(text = "Released : ${movie.year}", style = MaterialTheme.typography.caption)
                Text(text = "Rated : ${movie.rating}", style = MaterialTheme.typography.caption)

                Button(
                    onClick = {
                        onItemClicked(movie.year)
                    },
                    modifier = Modifier.padding(top = 12.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary)
                ) {
                    Text(text = "More.....", style = MaterialTheme.typography.caption)
                }

            }

        }
    }
}


@Composable
fun DetailsScreenContent(
    navController: NavController,
    expectedMovieList: List<BondMovie>
) {
    val scrollState = rememberScrollState()
    Scaffold(
        topBar = {
            TopAppBar(elevation = 0.dp) {

                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_back),
                        contentDescription = "back arrow",
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)
                            .padding(start = 8.dp)
                    )
                }
                Text(
                    text = "Details",
                    modifier = Modifier.padding(start = (4).dp),
                    fontSize = 24.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                )
            }
        },
    ) {
        Surface(
            color = MaterialTheme.colors.background, modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start, modifier = Modifier.verticalScroll(scrollState)) {


                Surface(modifier = Modifier.fillMaxWidth().height(400.dp)) {
                    Image(
                        painter = painterResource(id = expectedMovieList[0].image),
                        contentDescription = "Movie Image",
                        contentScale = ContentScale.FillBounds
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Rating : ${expectedMovieList[0].rating}", modifier = Modifier
                        .padding(3.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Released : ${expectedMovieList[0].year}",
                    modifier = Modifier.padding(start = 32.dp, top = 3.dp, bottom = 3.dp, end = 32.dp)
                )
                Text(
                    text = "Directed By : ${expectedMovieList[0].director}",
                    modifier = Modifier.padding(start = 32.dp, top = 3.dp, bottom = 3.dp, end = 32.dp)
                )
                Text(
                    text = "Starring : ${expectedMovieList[0].actors}",
                    modifier = Modifier.padding(start = 32.dp, top = 3.dp, bottom = 3.dp, end = 32.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Divider()
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = expectedMovieList[0].movieInfo,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}