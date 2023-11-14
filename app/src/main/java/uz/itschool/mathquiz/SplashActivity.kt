package uz.itschool.mathquiz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.animation.Animation
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Animatable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import uz.itschool.mathquiz.ui.theme.MathQuizTheme

@SuppressLint("CustomSplashScreen")
class SplashActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MathQuizTheme {
                splashScreen()
            }
        }
    }
    @Preview
    @Composable
    private fun splashScreen(){

        LaunchedEffect(key1 = true){
            delay(3000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }
          Box(modifier = Modifier
              .fillMaxSize()
              .background(Color.Black), contentAlignment = Alignment.Center){
              Column(horizontalAlignment = Alignment.CenterHorizontally){
                  Image(painter = painterResource(id = R.drawable.logo), contentDescription = null)
                  Text(modifier = Modifier.padding(25.dp), text = "MathQuiz", color = Color.White, fontSize = 33.sp, fontWeight = FontWeight.Bold)
              }

          }

    }
}