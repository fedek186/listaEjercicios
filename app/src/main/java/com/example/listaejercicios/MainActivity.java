package com.example.listaejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    ArrayList<zonaDeEjercicio> zonaArrayList= new ArrayList<>();
    adaptadorDeZonas zonasAdapter;
    zonaDeEjercicio unaZona= new zonaDeEjercicio();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.listaRutina);
        unaZona._nombre="Tren Superior";
        unaZona._imagen=getResources().getDrawable(R.drawable.rutinaprin);
        zonaArrayList.add(unaZona);
        zonaArrayList.add(unaZona);
        zonaArrayList.add(unaZona);
        zonasAdapter = new adaptadorDeZonas(zonaArrayList,this);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent llamada ;
                llamada = new Intent(getApplicationContext(), listaEjercicios.class);
                startActivity(llamada);
            }
        });
        lista.setAdapter(zonasAdapter);
    }
}
