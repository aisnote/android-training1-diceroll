package com.aisnote.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDive() }

        var countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener{ countUp() }

        var resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{ reset()}
    }

    private fun reset() {
        var resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }

    private fun countUp() {
        var resultText: TextView = findViewById(R.id.result_text)
        var result = resultText.text.toString()
        if (result == "Hello World!") {
            resultText.text = "1"
        } else if (result == "6") {

        } else {
            var temp = result.toInt() + 1
            resultText.text = temp.toString()
        }
    }

    private fun rollDive() {
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val randomInt = Random().nextInt(6) + 1
        var resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

}
