package com.fsg.juego_mina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Jugar(view: View) {

        var editTextNombreUsuario: EditText = findViewById(R.id.editTextNameUsuario);
        var usuario = editTextNombreUsuario.text.toString();

        var IntentJugar = Intent(this , ActivityJugar::class.java);
        IntentJugar.putExtra("nombreUsuario", usuario);
        Toast.makeText(this, "Sesion iniciada", Toast.LENGTH_LONG).show();
        startActivity(IntentJugar);
    }

    fun Salir(view: View) {
        finish();
        Toast.makeText(this, "Sesion finalizada", Toast.LENGTH_LONG).show();
    }
}