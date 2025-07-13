package com.example.project1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val gend=findViewById<TextView>(R.id.gen)
        val fem=findViewById<RadioButton>(R.id.rb1)
        val male=findViewById<RadioButton>(R.id.rb2)
        val ol=findViewById<TextView>(R.id.old)
        val h=findViewById<TextView>(R.id.height)
        val w=findViewById<TextView>(R.id.weight)
        val age=findViewById<EditText>(R.id.ip1)
        val height=findViewById<EditText>(R.id.ip2)
        val weight=findViewById<EditText>(R.id.ip3)
        val but=findViewById<Button>(R.id.cta2)
        val result=findViewById<TextView>(R.id.result)
        val disp=findViewById<TextView>(R.id.display)
        but.setOnClickListener {
            val heightInput = height.text.toString()
            val weightInput = weight.text.toString()

            if (heightInput.isNotEmpty() && weightInput.isNotEmpty()) {
                val heightVal = heightInput.toFloat()
                val weightVal = weightInput.toFloat()
                if (heightVal > 0)
                {
                    val bmi = weightVal / (heightVal * heightVal)
                    val (category, color) = when {
                        bmi < 18.5 -> "Underweight" to android.graphics.Color.BLACK
                        bmi in 18.5..24.9 -> "Normal weight" to android.graphics.Color.BLACK
                        bmi in 25.0..29.9 -> "Overweight" to android.graphics.Color.BLACK
                        else -> "Obese" to android.graphics.Color.RED
                    }
                    val resultText = "Your BMI is: %.2f\nCategory: %s".format(bmi, category)
                    disp.text = resultText
                    disp.setTextColor(color)
                }
                else
                {
                    disp.text = "Height must be greater than 0."
                    disp.setTextColor(android.graphics.Color.BLACK)
                }
            }
            else
            {
                disp.text = "Please enter both height and weight."
                disp.setTextColor(android.graphics.Color.BLACK)
            }
        }


    }
}