package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dice.ui.theme.DICETheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private lateinit var resultTextview: TextView
    private lateinit var rollButton: Button
    private lateinit var diceImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextview = findViewById(R.id.resultTextview)
        rollButton = findViewById(R.id.rollButton)
        diceImageView = findViewById(R.id.diceImageView)


        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNumber = Random.nextInt(6) + 1
        val resultText = "You rolled a $randomNumber"
        resultTextview.text = resultText

        val imageName = "dice$randomNumber"
        val imageResource = resources.getIdentifier(imageName, "drawable", packageName)
        diceImageView.setImageResource(imageResource)
    }
}