package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

             infoTextView.visibility = View.INVISIBLE


        calculateButton.setOnClickListener {
               //Bill

            val bill = billEditText.text.toString().toDouble()

            //Tip Percentage
            val tipPercentage = tipPercentageEdit.text.toString().toDouble()
               //Tip
            val tip = bill * (tipPercentage)/100
               //Total
             val total = tip + bill
            infoTextView.visibility = View.VISIBLE
            //Set InfoText
            infoTextView.text = "Tip: ${ftwo(tip)}  Total: ${ftwo(total)}"

        }
    }

        fun ftwo(number: Double): String {
            return String.format("%.2f", number)
        }
}
