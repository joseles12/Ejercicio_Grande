package com.fsg.areasconactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.coroutines.selects.select

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    var figura = "";
    var resultado: Int = 0;

    var param1: TextView = findViewById(R.id.editTextParam1);
    var param2: TextView = findViewById(R.id.editTextParam2);


    fun calcularArea(view: View) {

        if (intent.getStringExtra("figura") != null) {

            figura = intent.getStringExtra("figura").toString();


            if (figura.equals("cuadrado")) {

                param2.isVisible = false;

                resultado = param1.text.toString().toInt() * param1.text.toString().toInt()


                Toast.makeText(this, "El resultado es " + resultado, Toast.LENGTH_LONG)
            }

            else { Toast.makeText(this, "Eso no es cuadraddo ", Toast.LENGTH_LONG) }



            if (figura.equals("rectangulo")) {

                resultado = param1.text.toString().toInt() * param2.text.toString().toInt()

                Toast.makeText(this, "El resultado es " + resultado, Toast.LENGTH_LONG)
            }

            else { Toast.makeText(this, "Eso no es rectangulo ", Toast.LENGTH_LONG) }




            if (figura.equals("triangulo")) {

                resultado = (param1.text.toString().toInt() * param2.text.toString().toInt()) / 2

                Toast.makeText(this, "El resultado es " + resultado , Toast.LENGTH_LONG)
            }

            else { Toast.makeText(this, "Eso no es triangulo ", Toast.LENGTH_LONG) }

        }



    }

    fun Back(view: View) {
        finish()
    }

}





