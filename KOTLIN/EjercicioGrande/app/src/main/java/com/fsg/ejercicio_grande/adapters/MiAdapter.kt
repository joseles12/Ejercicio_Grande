package com.fsg.ejercicio_grande.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.fsg.ejercicio_grande.MainActivity
import com.fsg.ejercicio_grande.R
import com.fsg.ejercicio_grande.imageViewPhoto
import com.fsg.ejercicio_grande.models.DataItem

class MiAdapter ( private val activity: Activity , private val ListaElementos: ArrayList<DataItem>):
    BaseAdapter() {

    override fun getCount(): Int {
        return ListaElementos.size;
    }

    override fun getItem(p0: Int): Any {
        return ListaElementos[p0];
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong();
    }


    override fun getView(indice: Int, p1: View?, p2: ViewGroup?): View {

        var inflater = activity.layoutInflater;
        var filaView = inflater.inflate(R.layout.activity_listado , null , true );


        var textViewNombre = filaView.findViewById<TextView>(R.id.textViewNombre)
        var textViewApellidos = filaView.findViewById<TextView>(R.id.textViewApellidos)
        var textViewProfesion = filaView.findViewById<TextView>(R.id.textViewProfesion)


        textViewNombre.text = ListaElementos[indice].nombre;
        textViewApellidos.text = ListaElementos[indice].apellidos;
        textViewProfesion.text = ListaElementos[indice].profesion;

        return filaView;
    }


}