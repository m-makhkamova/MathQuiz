package uz.itschool.mathquiz.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import uz.itschool.mathquiz.R
import uz.itschool.mathquiz.navigation.NavGraph


@Composable
 fun SplashScreen(navController: NavController){
        LaunchedEffect(key1 = true){
            delay(3000)
        }
          Box(modifier = Modifier
              .fillMaxSize()
              .background(Color(0xFF7646FE)), contentAlignment = Alignment.Center){
              Column(horizontalAlignment = Alignment.CenterHorizontally){
                  Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo")
                  Spacer(modifier = Modifier.height(25.dp))
                  Image(modifier = Modifier.height(50.dp).width(190.dp), painter = painterResource(id = R.drawable.app_name), contentDescription = "App Name")
              }

          }

    }
@Preview(showBackground = true)
@Composable

fun testSplash(){
    val navController = rememberNavController()
    NavGraph(navController = navController)
    SplashScreen(navController = navController)
}

