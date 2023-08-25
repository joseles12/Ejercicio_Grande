package com.fsg.ejercicio_grande

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityListado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado)

        var listado = intent.getStringArrayExtra("Listado")

        var editTextNombre: TextView = findViewById(R.id.textViewNombre);
        var editTextApellidos: TextView = findViewById(R.id.textViewApellidos);
        var editTextProfesion: TextView = findViewById(R.id.textViewProfesion);

        editTextNombre.setText( listado.toString() )

    }
}