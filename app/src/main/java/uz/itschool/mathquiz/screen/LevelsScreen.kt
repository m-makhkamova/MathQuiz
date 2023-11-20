package uz.itschool.mathquiz.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import uz.itschool.mathquiz.R
import uz.itschool.mathquiz.navigation.NavGraph

@Composable
fun LevelsScreen(navController: NavController){

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF7646FE)), contentAlignment = Alignment.Center){
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            Image(modifier = Modifier.height(250.dp).width(350.dp), painter = painterResource(id = R.drawable.levels_img), contentDescription = "Levels")
            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = {
                navController.navigate("quiz_screen")
            }, modifier = Modifier
                .width(250.dp)
                .height(45.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFCAB7FF)), border = BorderStroke(2.dp, Color.White)
            ) {
                Text(text = "Easy", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                navController.navigate("levels_screen")
            }, modifier = Modifier
                .width(250.dp)
                .height(45.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFFFA9D2)), border = BorderStroke(2.dp, Color.White)
            ) {
                Text(text = "Medium", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                navController.navigate("levels_screen")
            }, modifier = Modifier
                .width(250.dp)
                .height(45.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0XFFFFB184)), border = BorderStroke(2.dp, Color.White)
            ) {
                Text(text = "Hard", fontSize = 18.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable

fun testLevels(){
    val navController = rememberNavController()
    NavGraph(navController = navController)
    LevelsScreen(navController = navController)
}