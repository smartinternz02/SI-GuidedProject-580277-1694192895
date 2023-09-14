package com.example.loginpage1

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.*
import  androidx.compose.runtime.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.net.URI
import com.example.loginpage1.ui.theme.Loginpage1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen1()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen1() {
    var username by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.shopping),
            contentDescription = "Login Image",
            modifier = Modifier.size(300.dp).padding(16.dp)
        )
        Text(
            text = "Login",
            style = MaterialTheme.typography.headlineMedium.copy(color = Color(0xFF476810))
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = username,
            onValueChange = {username = it},
            label = { Text(text = "Username")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Password")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {

                }
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = {
                val url="https://www.amazon.com"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

                if (intent.resolveActivity(context.packageManager) != null) {
                    context.startActivity(intent)
                }
                else {
                    Toast.makeText(context, "No web browser available", Toast.LENGTH_LONG).show()
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "AMAZON")
        }
        Button(
            onClick = {
                val url="https://www.walmart.com"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

                if (intent.resolveActivity(context.packageManager) != null) {
                    context.startActivity(intent)
                }
                else {
                    Toast.makeText(context, "No web browser available", Toast.LENGTH_LONG).show()
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "WALMART")
        }
        Button(
            onClick = {
                val url="https://www.ebay.com"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

                if (intent.resolveActivity(context.packageManager) != null) {
                    context.startActivity(intent)
                }
                else {
                    Toast.makeText(context, "No web browser available", Toast.LENGTH_LONG).show()
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "EBAY")
        }
        Button(
            onClick = {
                val url="https://www.myntra.com"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

                if (intent.resolveActivity(context.packageManager) != null) {
                    context.startActivity(intent)
                }
                else {
                    Toast.makeText(context, "No web browser available", Toast.LENGTH_LONG).show()
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "MYNTRA")
        }
    }
}