package com.aisnote.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDive() }

        var clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener{
            diceImage.setImageResource(R.drawable.empty_dice)
            diceImage2.setImageResource(R.drawable.empty_dice)
        }

    }

    // Coding challenge: https://codelabs.developers.google.com/codelabs/kotlin-android-training-images-compat/#7
    private fun getRandomDiceImage(): Int {
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }

    private fun reset() {
//        var resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "0"
    }

    private fun countUp() {
//        var resultText: TextView = findViewById(R.id.result_text)
//        var result = resultText.text.toString()
//        if (result == "Hello World!") {
//            resultText.text = "1"
//        } else if (result == "6") {
//
//        } else {
//            var temp = result.toInt() + 1
//            resultText.text = temp.toString()
//        }
    }

    private fun rollDive() {
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val drawableResource = getRandomDiceImage()

        diceImage.setImageResource(drawableResource)

        val drawableResource2 = getRandomDiceImage()

        diceImage2.setImageResource(drawableResource2);
    }

}
