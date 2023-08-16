package com.fsg.constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class SesionIniciada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sesion_iniciada)

        var NameUsuario: TextView = findViewById(R.id.textViewNameUsuario);

        NameUsuario.text = intent.getStringExtra("usuario").toString();
    }

    fun salir(view: View) {
        finish();
        Toast.makeText(this , "La sesion ha finalizado" , Toast.LENGTH_LONG).show();
    }

    fun guardar(view: View) {
        Toast.makeText(this , "Todo se ha guardado correctamente" , Toast.LENGTH_LONG).show();
    }

}