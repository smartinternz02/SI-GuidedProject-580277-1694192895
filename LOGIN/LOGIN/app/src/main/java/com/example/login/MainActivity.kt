package com.example.login

import android.icu.text.AlphabeticIndex.Bucket.LabelType
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login.ui.theme.LOGINTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(modifier = Modifier.fillMaxSize() ,
                verticalArrangement = Arrangement.Center ,
                horizontalAlignment = Alignment.CenterHorizontally) {

                simpleText()
                simpleTextField()
                Spacer(modifier = Modifier.padding(5.dp))
                simpleTextField2()
                simpleButton()

            }

        }
    }
}

@Composable
fun simpleText(){

    Text(text = "LOGIN PAGE" ,
        modifier = Modifier
            .height(50.dp) ,
        style = TextStyle.Default)

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleTextField(){

    var text by remember { mutableStateOf("") }
    TextField(value = text , onValueChange = {it -> text = it } ,
        label = { Text(text = "Username")})

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleTextField2(){

    var text by remember { mutableStateOf("") }
    TextField(value = text , onValueChange = {it -> text = it } ,
        label = { Text(text = "Password")})

}

@Composable
fun simpleButton(){
    
    Button(modifier = Modifier.padding(16.dp),
        onClick = { /*TODO*/ }) {

        Text(text = "SUBMIT")
        
    }
    
}



@Preview
@Composable
fun simpleTextPreview(){

    Column(modifier = Modifier.fillMaxSize() ,
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally) {

        simpleText()
        simpleTextField()
        Spacer(modifier = Modifier.padding(5.dp))
        simpleTextField2()
        simpleButton()

    }

}
