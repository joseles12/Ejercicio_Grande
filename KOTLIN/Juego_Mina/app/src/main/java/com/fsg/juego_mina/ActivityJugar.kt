package com.fsg.juego_mina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ActivityJugar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jugar)

        var usuario = intent.getStringExtra("nombreUsuario");

        var editTextNombreUsuario: TextView = findViewById(R.id.textViewUsuario);

        editTextNombreUsuario.setText(usuario.toString());
    }

    fun cancelar(view: View) {

        var cancelarPartida = Intent(this , MainActivity::class.java);
        startActivity(cancelarPartida);
    }

    fun resolver(view: View) {}
}