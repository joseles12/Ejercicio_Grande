package com.example.listviews.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listviews.R
import com.example.listviews.models.DataItem

class MiAdapter(private val activity: Activity, private val listaElementos: ArrayList<DataItem>): BaseAdapter() {

    class ViewHolder{
        lateinit var imageViewBandera : ImageView;
        lateinit var textViewNombre: TextView;
        lateinit var textViewApellidos: TextView;
    }

    override fun getCount(): Int {
        return listaElementos.size;
    }

    override fun getItem(p0: Int): Any {
        return listaElementos[p0];
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong();
    }

    /* override fun getView(indice: Int, p1: View?, p2: ViewGroup?): View {
          var inflater = activity.layoutInflater;
          var filaView = inflater.inflate(R.layout.elemento_layout, null, true);

          var textViewNombre = filaView.findViewById<TextView>(R.id.textViewNombre);
          var textViewApellidos = filaView.findViewById<TextView>(R.id.textViewApellidos);
          var imageViewBandera = filaView.findViewById(R.id.imageViewBandera) as ImageView;

          if (listaElementos[indice].bandera.equals("es")){
              imageViewBandera.setImageResource(R.drawable.es);
          } else{
              imageViewBandera.setImageResource(R.drawable.en);
          }

          textViewNombre.text = listaElementos[indice].nombre;
          textViewApellidos.text = listaElementos[indice].apellido;

          return filaView;
      }*/

    override fun getView(indice: Int, view: View?, p2: ViewGroup?): View {
        var  filaView= view;
        var viewHolder = ViewHolder();

        if(filaView == null){
            var inflater = activity.layoutInflater;
            filaView = inflater.inflate(R.layout.elemento_layout, null, true);

            viewHolder.textViewNombre = filaView.findViewById<TextView>(R.id.textViewNombre);
            viewHolder.textViewApellidos = filaView.findViewById<TextView>(R.id.textViewApellidos);
            viewHolder.imageViewBandera = filaView.findViewById(R.id.imageViewBandera) as ImageView;

            filaView.tag = viewHolder;
        }
        else{
            viewHolder = filaView.tag as MiAdapter.ViewHolder
        }


        if (listaElementos[indice].bandera.equals("es")){
            viewHolder.imageViewBandera.setImageResource(R.drawable.es);
        } else{
            viewHolder.imageViewBandera.setImageResource(R.drawable.en);
        }

        viewHolder.textViewNombre.text = listaElementos[indice].nombre;
        viewHolder.textViewApellidos.text = listaElementos[indice].apellido;

        return filaView!!;
    }
