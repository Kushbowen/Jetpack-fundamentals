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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
    Column(modifier = Modifier
        .fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
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
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black
                    )
                }
            },
            actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notification",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { val shareIntent= Intent(Intent.ACTION_SEND)

                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share")) }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "search",
                        tint = Color.Black
                    )
                }
            },


            )
        //Enf of TaskBar
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())) {
            Text(text = "Tickets",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp))

            Spacer(modifier = Modifier.height(10.dp))
            //Column 1
            Row (modifier = Modifier
                .horizontalScroll(
                    rememberScrollState()
                )
                .padding(start = 25.dp)){


            Column {
                Card(modifier = Modifier
                    .height(100.dp)
                    .width(160.dp)) {
                    Box (modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.seychelles),
                            contentDescription = "Seychelles",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds)
                        Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp))


                    }


                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(text = "Colosseum",
                    fontFamily = FontFamily.Serif,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    )
                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(imageVector = Icons.Default.Star, contentDescription ="Rates", tint = Color.Blue )
                     Icon(imageVector = Icons.Default.Star, contentDescription ="Rates",tint = Color.Blue  )
                     Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )
                     Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )
                     Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )

                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "443 reviewers",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,

                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "Ksh.760,000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,

                    )
                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    OutlinedButton(onClick = {
                        val callIntent=Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0745625882".toUri()
                        mContext.startActivity(callIntent) }) {
                        Text(text = "Call")

                    }
                    OutlinedButton(onClick = {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("faithbkush@gmail.com"))
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                        mContext.startActivity(shareIntent)
                    }) {
                        Text(text = "Email")

                    }
                }



            }
                //End of Column 1

                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)) {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.hotel1),
                                contentDescription = "Seychelles",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))


                        }


                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Self Guided Tour",
                        fontFamily = FontFamily.Serif,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates", tint = Color.Blue )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates",tint = Color.Blue  )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )

                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "1,952 reviewers",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp,

                        )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Ksh.160,000",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp,

                        )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0725889663".toUri()
                            mContext.startActivity(callIntent) }) {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("managerdestination@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")

                        }
                    }



                }
                //End of Column 1




            }
            //End of Row 1
            Spacer(modifier = Modifier.height(20.dp))
            Row (modifier = Modifier
                .horizontalScroll(
                    rememberScrollState()
                )
                .padding(start = 25.dp))
            {
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)) {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.pool),
                                contentDescription = "Seychelles",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))


                        }


                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "The VIP ",

                        fontFamily = FontFamily.Serif,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Text(text = "Colosseum ",

                        fontFamily = FontFamily.Serif,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates", tint = Color.Blue )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates",tint = Color.Blue  )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )

                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "547 reviewers",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp,

                        )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Ksh.102,000",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp,

                        )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0725889663".toUri()
                            mContext.startActivity(callIntent) }) {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("managerdestination@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")

                        }
                    }



                }
                //End of Column 1
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)) {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.savanna),
                                contentDescription = "Seychelles",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))


                        }


                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "Exclusive",
                        fontFamily = FontFamily.Serif,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates", tint = Color.Blue )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates",tint = Color.Blue  )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )
                        Icon(imageVector = Icons.Default.Star, contentDescription ="Rates" ,tint = Color.Blue )

                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "648 reviewers",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp,

                        )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Ksh.560,000",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp,

                        )
                    Spacer(modifier = Modifier.height(25.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0725889663".toUri()
                            mContext.startActivity(callIntent) }) {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("managerdestination@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")

                        }
                    }



                }
                //End of Column 1











            }


        }
        
    }

}

@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()
}