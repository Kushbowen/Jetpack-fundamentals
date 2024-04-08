package com.example.bowen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.bowen.ui.theme.Blue
import com.example.bowen.ui.theme.PurpleGrey40

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Third()

        }
    }
}

@Composable
fun Third(){
    Column (modifier = Modifier.
    fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        val mContext = LocalContext.current
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.travel2), contentDescription = "girl",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

        }
        Text(text = "Pay for the flights",
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 20.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "A: MakeMyTrip makes use of a world-class real-time reservation database to list airfare and availability. As dynamic changes in airfare take place, or the available flight tickets sell out, the database reflects the changes in real-time. ",
            fontSize = 20.sp)

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0745625882".toUri()
                mContext.startActivity(callIntent)


            }, shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(PurpleGrey40),
            modifier = Modifier

                .padding(start = 10.dp, end = 10.dp)
        ) {
            Text(text = "Book a flight")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext, MainActivity::class.java))


            }, shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        ) {
            Text(text = "Next")
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ThirdPreview(){
    Third()
}