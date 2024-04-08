package com.example.bowen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class FurnitureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Furniture()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Furniture(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext =
            LocalContext.current
        TopAppBar(
            title = { Text(text = "", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, LayoutActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.Black)

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Favorite",
                        tint = Color.Black)

                }
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))

                }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "Share",
                        tint = Color.Black)

                }


            }

        )
        //End of TopAppBar
        Row (modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Chairs",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.width(30.dp))
            Text(
                text = "Tables",
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Sofa",
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Beds",
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.width(10.dp))


        }
        Spacer(modifier = Modifier.height(10.dp))
        Row (modifier = Modifier.fillMaxWidth()){
            Text(text = "120 Products",
                fontSize = 20.sp)
            Spacer(modifier = Modifier.width(100.dp))


                Box(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {

                    Text(text = "Popular",
                        fontSize = 20.sp,
                        textAlign = TextAlign.End)
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Dropdown",
                        tint = Color.Black,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)
                    )


                }


        }
            }

        }






@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FurniturePreview(){
    Furniture()
}