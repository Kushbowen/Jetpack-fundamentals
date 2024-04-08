package com.example.bowen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bowen.ui.theme.Grey
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MySplash()

            val mContext = LocalContext.current
            val coroutine = rememberCoroutineScope()
            coroutine.launch{
                delay(1000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                finish()
            }

        }
    }
}

@Composable
fun MySplash(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Grey),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {

        Spacer(modifier = Modifier.height(20.dp))

        

Box (modifier = Modifier

    .align(Alignment.CenterHorizontally)){
    Image(painter = painterResource(id = R.drawable.plane), contentDescription = "flight")
}
        Text(text = "Welcome to my app!",
            fontFamily = FontFamily.Cursive,
            fontSize = 20.sp,
            color = Color.Blue)


        Spacer(modifier = Modifier.height(330.dp))



        Text(text = "Book your flight!",
            fontFamily = FontFamily.Cursive,
            fontSize = 20.sp,
            color = Color.Blue)



    }

}

@Preview(showBackground = true)
@Composable
fun MySplashPreview(){
    MySplash()
}