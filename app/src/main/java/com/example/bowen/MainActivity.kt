package com.example.bowen


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable

fun Demo(){
Column (modifier = Modifier.fillMaxSize() ){

    val mContext = LocalContext.current
    


    Text(
        text = "Welcome to Android",
        textDecoration = TextDecoration.Underline,
        fontSize = 30.sp,
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,

        )
    Text(
        text = "Android Programming..." +
                "Android was developed by the Open Handset Alliance, led by Google, and other companies."
    )
    Spacer(modifier = Modifier.height(20.dp))

    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition, progress,
        modifier = Modifier.size(300.dp)
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Types of cars",
        fontSize = 20.sp,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height(30.dp),
        color = Color.White,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )

    Text(text = "1. Subaru")
    Text(text = "2. Audi")
    Text(text = "3. Mercedes Benz")
    Spacer(modifier = Modifier.height(20.dp))

    //Aligning a button..
    Button(
        onClick = {
            mContext.startActivity(Intent(mContext, DestinationActivity::class.java))

        }, shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Black),
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
    ) {
        Text(
            text = "Destination",
            color = Color.White,


            )

    }

    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Courses offered",
        fontSize = 20.sp,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.Center,
        color = Color.Black,
        textDecoration = TextDecoration.LineThrough,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .height(40.dp)
    )
    Text(text = "1. Computer Science")
    Text(text = "2. Dental Surgery")
    Text(text = "3. Medicine and Surgery")
    Text(text = "4. Pharmacy")
    Spacer(modifier = Modifier.height(20.dp))

    Button(
        onClick = {
            mContext.startActivity(Intent(mContext, LottieActivity::class.java))

        }, shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Gray),
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
    ) {
        Text(
            text = "see more courses",
            color = Color.White,


            )

    }
    Divider()



    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "eMobilis mobile training institute",
        fontWeight = FontWeight.ExtraBold,
        fontSize = 20.sp
    )

    Spacer(modifier = Modifier.height(20.dp))


//centering an image
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.d2), contentDescription = "girl",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
    }
    Button(
        onClick = {
            mContext.startActivity(Intent(mContext, LayoutActivity::class.java))
        }, shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Red),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp)
    ) {
        Text(text = "Continue")
    }



}
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}