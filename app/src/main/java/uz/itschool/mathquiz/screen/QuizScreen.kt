package uz.itschool.mathquiz.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import uz.itschool.mathquiz.navigation.NavGraph

@Composable
fun QuizScreen(navController: NavController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF7646FE)), contentAlignment = Alignment.Center
    ){
        Column(){
            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(80.dp),
                shape = MaterialTheme.shapes.medium
            ) {
            }
            Button(onClick = {}) {
                Text(text = "+")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun testQuiz(){
    val navController = rememberNavController()
    NavGraph(navController = navController)
    QuizScreen(navController = navController)
}