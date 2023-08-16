package com.fsg.notasmedias

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import com.fsg.notasmedias.databinding.ActivityMainBinding
import com.fsg.notasmedias.model.Alumno

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAnchorView(R.id.fab)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }


    var alumnos: ArrayList<Alumno> ();


    fun darNombreAlumno ( view: View ) {


    }


    fun calcularMedia ( view: View ) {

        var textViewResultado: TextView = findViewById(R.id.textViewResultado);

        if ( alumnos.size > 0 ) {

            var acumulador: Double = 0.0;
            var media: Double = 0.0;

            for (alumno in alumnos) {

                acumulador = acumulador + alumno.nota;
            }

            media = acumulador / alumnos.size;

            textViewResultado.text = "La media es " + media;

        }

        else {

            textViewResultado.text = "No hay alumnos dados en alta"
        }

    }


    fun anadirAlumno( view: View ) {

        var editTextNombre: EditText = findViewById(R.id.editTextTextNombre);
        var editTextNota: EditText = findViewById(R.id.editTextTextNota);

        var alumno: Alumno = Alumno(editTextNombre.text.toString() , editTextNota.text.toString().toDouble())

        alumnos.add(alumno);

        editTextNombre.text.clear();
        editTextNota.text.clear();
    }
}