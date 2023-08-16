package com.fsg.constraint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Sesion(view: View) {

        var UsuarioTexTView: TextView = findViewById(R.id.editTextUsuario);
        var PasswordTexTView: TextView = findViewById(R.id.editTextPassword);

        var PasswordValue = PasswordTexTView.text.toString();
        var UsuarioValue = UsuarioTexTView.text.toString();

        if ( PasswordValue.equals("Jose1") ) {

            var iniciarSesion: Intent = Intent(this, SesionIniciada::class.java);
            iniciarSesion.putExtra("usuario" , UsuarioValue )
            startActivity(iniciarSesion);
        }

        else {
            Toast.makeText(this , "Inicio de sesion incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}