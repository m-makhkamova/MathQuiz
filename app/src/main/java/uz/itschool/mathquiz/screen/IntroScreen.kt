package uz.itschool.mathquiz.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import uz.itschool.mathquiz.R
import uz.itschool.mathquiz.navigation.NavGraph


@Composable
fun IntroScreen(navController: NavController){

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp), contentAlignment = Alignment.Center){
        Column {
            Button(onClick = {}, modifier = Modifier
                .width(200.dp)
                .height(45.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFFF9051))) {
                Text(text = "New Game", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {}, modifier = Modifier
                .width(200.dp)
                .height(45.dp), RoundedCornerShape(topStart = 20.dp, bottomEnd = 20.dp)
            ) {
                Text(text = "Records", fontSize = 18.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable

fun testIntro(){
    val navController = rememberNavController()
    NavGraph(navController = navController)
    IntroScreen(navController = navController)
}