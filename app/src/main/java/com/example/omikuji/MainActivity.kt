package com.example.omikuji

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.getOmikujiButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        button.setOnClickListener {
//            Log.v("MainActivity", "Button Clicked")
            val results = arrayOf("大吉","中吉","吉","凶")

            val n = Random().nextInt(results.count())

            if (n == 0) {
                resultTextView.setTextColor(Color.RED)
            } else {
                resultTextView.setTextColor(Color.parseColor("#808080"))
            }

            resultTextView.text = results[n]
        }
    }
}