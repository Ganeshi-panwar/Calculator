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
        if (isNewOp==true){
            entryData.setText("")
        }
        isNewOp = false

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

    var op = "*"
    var oldNumber = ""
    var isNewOp = true
    fun buOperationEvent(view:View){
        val entryData = findViewById<EditText>(R.id.etShowNumber)
        val buSelect = view as Button
        var buClickValue:String = entryData.text.toString()
        when(buSelect.id){
            R.id.buMulti -> {
                buClickValue += "X"
                op = "*"

            }

            R.id.buAdd -> {
                buClickValue += "+"
                op = "+"



            }
            R.id.buDiv ->{
                buClickValue += "/"
                op = "/"


            }
            R.id.buMinus ->{
                buClickValue += "-"
                op = "-"


            }


        }
            entryData.setText(buClickValue)
        oldNumber= entryData.text.toString()
       // isNewOp=true
    }
    fun buEqaulEvent(view:View) {
        val entryData = findViewById<EditText>(R.id.etShowNumber)
        var newNumber = entryData.text.toString()
        var findNumber: Double? = null
       // if (!oldNumber.isEmpty() && !newNumber.isEmpty()) {
            when (op) {
                "*" -> {
                    findNumber = oldNumber.toDouble() * newNumber.toDouble()
                }

                "/" -> {
                    findNumber = oldNumber.toDouble() / newNumber.toDouble()
                }

                "+" -> {
                    findNumber = oldNumber.toDouble() + newNumber.toDouble()
                }

                "-" -> {
                    findNumber = oldNumber.toDouble() - newNumber.toDouble()
                }

            }
            entryData.setText(findNumber.toString())
            isNewOp = true

//        }else{
//            println("empty value ")
//        }
    }

    fun buClearEvent(view:View){
        var entryData = findViewById<EditText>(R.id.etShowNumber)
        entryData.setText("0")
        isNewOp = true
    }

    fun buParsentEvent(view:View){
        var entryDara = findViewById<EditText>(R.id.etShowNumber)
        var number:Double = entryDara.text.toString().toDouble()/100
        entryDara.setText(number.toString())
    }
}
