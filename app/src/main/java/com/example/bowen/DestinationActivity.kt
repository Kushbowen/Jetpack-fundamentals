package com.example.bowen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){

    Column (modifier = Modifier
        .fillMaxSize()){
        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "DESTINATIONS", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = {

                    mContext.startActivity(
                        Intent(
                            mContext,
                            MainActivity::class.java
                        )
                    )
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "back",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { val shareIntent= Intent(Intent.ACTION_SEND)

                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share")) }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White
                    )
                }
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            ExploreActivity::class.java
                        )
                    )
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "settings",
                        tint = Color.White
                    )
                }
            },


            )
        //End of TopAppBar

        Box (modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(id = R.drawable.destination1), contentDescription = "Seychelles",
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
                )
            Text(text = "Let's plan your next vacation",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Green,
                textAlign = TextAlign.Center)


        }
        //End of BOX
        Spacer(modifier = Modifier.height(10.dp))

        var search by remember { mutableStateOf(value = "")
        }
        OutlinedTextField(value = search,
            onValueChange = {search = it},
            placeholder = { Text(text = "what's your destination?",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search",
                tint = Color.Black)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp))
        //End of SearchBar

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Recently viewed",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 20.dp))
        Spacer(modifier = Modifier.height(10.dp))
        //Start of card
       Row (modifier = Modifier
           .horizontalScroll(rememberScrollState()
           )){

           Card (modifier = Modifier
               .height(200.dp)
               .width(200.dp)){
               Column {
                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(painter = painterResource(id = R.drawable.destination2),
                           contentDescription ="Savannah",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)


                   }
                   Text(text = "SAVANNA",
                       fontSize = 30.sp,
                       fontWeight = FontWeight.Bold,
                       modifier = Modifier
                           .fillMaxWidth())


               }



           }
           Spacer(modifier = Modifier.width(10.dp))



           Card (modifier = Modifier
               .height(200.dp)
               .width(200.dp)){
               Column {
                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(painter = painterResource(id = R.drawable.destination2),
                           contentDescription ="Savannah",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)


                   }
                   Text(text = "SAVANNA",
                       fontSize = 30.sp,
                       fontWeight = FontWeight.Bold,
                       modifier = Modifier
                           .fillMaxWidth())


               }



           }
           Spacer(modifier = Modifier.width(10.dp))

           Card (modifier = Modifier
               .height(200.dp)
               .width(200.dp)){
               Column {
                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(painter = painterResource(id = R.drawable.destination2),
                           contentDescription ="Savannah",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)


                   }
                   Text(text = "SAVANNA",
                       fontSize = 30.sp,
                       fontWeight = FontWeight.Bold,
                       modifier = Modifier
                           .fillMaxWidth())


               }



           }
       }
        //End of Card 1




    }


}



@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()
}