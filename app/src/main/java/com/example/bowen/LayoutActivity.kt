package com.example.bowen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout() {
    Column {


        val mContext = LocalContext.current

        //topApp bar
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
                IconButton(onClick = { val shareIntent=Intent(Intent.ACTION_SEND)

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
            },


            )
        //end of topApp Bar
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Places To Tour",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        //start of row 1
        Row {
            Image(
                painter = painterResource(id = R.drawable.destination2),
                contentDescription = "SAVANNAH",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Column {
                Text(text = "SAVANNA", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Goku is pure of heart, possessing no negative feelings or thoughts. He is highly loyal.")
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        //end of row 1
        //start of row 2
        Row {
            Image(
                painter = painterResource(id = R.drawable.destination1),
                contentDescription = "ZAMBIA",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Column {
                Text(text = "ZAMBIA", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Toji is pure of heart, possessing no negative feelings or thoughts. He is highly loyal ")
            }
        }
        //end of row 2
        Spacer(modifier = Modifier.height(5.dp))
        //start of row 3
        Row {
            Image(
                painter = painterResource(id = R.drawable.pool),
                contentDescription = "SEYCHELLES",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Column {
                Text(text = "SEYCHELLES", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "fuga is pure of heart, possessing no negative feelings or thoughts. He is highly loyal")
            }
        }
        //end of row 3
        Spacer(modifier = Modifier.height(320.dp))
        Button(
            onClick = { mContext.startActivity(Intent(mContext, FormActivity::class.java)) },

            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp)



            ) {
            Text(text = "Sign Up")


        }

    }
}






@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}
