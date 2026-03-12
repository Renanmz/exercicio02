package com.atividade1.exercicio02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.atividade1.exercicio02.ui.theme.Exercicio02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Exercicio02Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    Row(modifier = Modifier
        .fillMaxSize()
        .border(1.dp, color = Color.Black)) {
        Column(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF5C6BC0)))
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(Color.Black)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFE91E63)))
        }
        Spacer(
            modifier = Modifier
                .width(3.dp)
                .fillMaxHeight()
                .background(Color.Black)
        )
        Column(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()

        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFA71925)))
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(Color.Black)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.LightGray))
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(Color.Black)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF303F9F)))
        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Exercicio02Theme {
        MyApp()
    }
}