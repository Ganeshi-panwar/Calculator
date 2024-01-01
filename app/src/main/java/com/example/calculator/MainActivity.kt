package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buNumberClick(view: View) {
        val entryData = findViewById<EditText>(R.id.etShowNumber)
        val buSelect = view as Button
        var buClickValue: String = entryData.text.toString()

        when (buSelect.id) {
            R.id.bu0 -> buClickValue += "0"
            R.id.bu1 -> buClickValue += "1"
            R.id.bu2 -> buClickValue += "2"
            R.id.bu3 -> buClickValue += "3"
            R.id.bu4 -> buClickValue += "4"
            R.id.bu5 -> buClickValue += "5"
            R.id.bu6 -> buClickValue += "6"
            R.id.bu7 -> buClickValue += "7"
            R.id.bu8 -> buClickValue += "8"
            R.id.bu9 -> buClickValue += "9"
            R.id.buDot -> buClickValue += "."
          //  else -> buClickValue = "0"
        }
        entryData.setText(buClickValue)

    }

    fun buOperationEvent(view:View){
        val entryData = findViewById<EditText>(R.id.etShowNumber)
        val buSelect = view as Button
        var buClickValue:String = entryData.text.toString()
        when(buSelect.id){
            R.id.buMulti -> {

            }
            R.id.buAdd -> {


            }
            R.id.buDiv ->{

            }
            R.id.

        }
    }

}