package com.fsg.areasconactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun intentCuadrado (view: View) {

        var next  = Intent ( this, MainActivity2:: class.java)
        next.putExtra("figura", "cuadrado" );
        startActivity(next);
    }

    fun intentRectangulo (view: View) {

        var next  = Intent ( this, MainActivity2:: class.java)
        next.putExtra("figura", "rectangulo" );
        startActivity(next);
    }

    fun intentTriangulo (view: View) {

        var next  = Intent ( this, MainActivity2:: class.java)
        next.putExtra("figura", "triangulo" );
        startActivity(next);
    }

}