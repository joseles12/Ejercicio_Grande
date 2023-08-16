package com.fsg.primeraapp

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

    fun clickBoton(view: View) {

        var tvTitulo: TextView = findViewById(R.id.tvTitulo);

        var etNombre: EditText = findViewById(R.id.textoUsuario);

        var textoUsuario = etNombre.text;

        tvTitulo.text = "Hola" + textoUsuario;
    }
}


