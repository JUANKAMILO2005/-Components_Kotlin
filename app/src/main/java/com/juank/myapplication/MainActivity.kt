package com.juank.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

var ets1:CheckBox?=null
    var ets2:CheckBox?=null

    var rd1:RadioButton?=null
    var rd2:RadioButton?=null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ets1 = findViewById(R.id.checkbox1)
        ets2 = findViewById(R.id.checkbox2)

        rd1 = findViewById(R.id.radio1)
        rd2 = findViewById(R.id.radio2)

        val botonIngresar: Button = findViewById(R.id.btnIngresar)
        botonIngresar.setOnClickListener { realizarIngreso() }


    }

    private fun realizarIngreso() {


        val Text: EditText = findViewById(R.id.editTextNombre)
        val Nombre: String = Text.text.toString()

        val toggle: ToggleButton = findViewById(R.id.botonTogle)
        val OptionToggle: String = toggle.text.toString()


        var cad: String = "Seleccionado:\n"
        if (ets1?.isChecked == true) {
            cad += "Opcion 1"
        }
        if (ets2?.isChecked == true) {
            cad += "Opcion 2"
        }



        var cad2: String = "Seleccionado: \n"
        if (rd1?.isChecked == true) {
            cad2 += "Radio 1"
        }
        if (rd2?.isChecked == true) {
            cad2 += "Radio 2"
        }






        Toast.makeText(
            this, "$Nombre" +
                    "\n$cad" +
                    "\n$cad2" +
                    "\n$OptionToggle", Toast.LENGTH_LONG
        ).show()


    }
}

