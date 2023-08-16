package com.fsg.areas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular (view: View) {

        var editTextBase: EditText = findViewById(R.id.editTextBase);
        var editTextAltura: EditText = findViewById(R.id.editTextAltura);
        var textViewResultado: TextView = findViewById(R.id.textViewResultado);

        if (editTextBase == editTextBase) { // CUADRADO

            textViewResultado.text = "El resultado del area del cuaadrado es " +
                    ( editTextAltura.toString().toInt() *  editTextAltura.toString().toInt() )
        }

        else // RECTANGULO
            textViewResultado.text =  "El resultado del area del rectangulo es " +
                    ( editTextAltura.toString().toInt() *  editTextBase.toString().toInt() );
        }


}

