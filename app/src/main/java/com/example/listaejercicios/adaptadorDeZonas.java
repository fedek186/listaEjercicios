package com.example.listaejercicios;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptadorDeZonas extends BaseAdapter {
    private ArrayList<zonaDeEjercicio> arrayZona;
    zonaDeEjercicio zona= new zonaDeEjercicio();
    private Context miContexto;
    TextView Nomb,intro;
    ImageView imgPrin,Icon;
    Button Btn;
    public adaptadorDeZonas (ArrayList<zonaDeEjercicio> arrLog, Context contexto) {
        arrayZona = arrLog;
        miContexto = contexto;
    }

    @Override
    public int getCount() {
        return arrayZona.size();
    }

    @Override
    public zonaDeEjercicio getItem(int position) {
        zonaDeEjercicio ej;
        ej = arrayZona.get(position);
        return ej;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista;
        LayoutInflater inflador;
        inflador = (LayoutInflater) miContexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        vista = inflador.inflate(R.layout.layout_tipo_ejercicio, parent, false);
        Nomb = vista.findViewById(R.id.NombreTipoDeEjercicio);
        intro = vista.findViewById(R.id.textoIntoTipoEjer);
        imgPrin = vista.findViewById(R.id.imagenTipoDeEjercicio);
        Btn= vista.findViewById(R.id.btnTipoDeEjercicio);
        zona=getItem(position);
        Nomb.setText(zona._nombre);
        imgPrin.setImageDrawable(zona._imagen);
        Btn.setText("Listo!");
        if(zona._finish==false)
        {
            intro.setText("Siguiente");
        }

        return vista;
    }


}