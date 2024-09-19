package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the ImageView and Button from the layout
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)

        // Set an onClickListener to roll the dice when the button is clicked
        rollButton.setOnClickListener {
            rollDice(diceImage)
        }
    }

    // Function to handle the dice rolling and image update
    private fun rollDice(diceImage: ImageView) {
        // Generate a random number between 1 and 6
        val randomNumber = (1..6).random()

        // Map the random number to the corresponding dice image
        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource
        diceImage.setImageResource(drawableResource)
    }
}
