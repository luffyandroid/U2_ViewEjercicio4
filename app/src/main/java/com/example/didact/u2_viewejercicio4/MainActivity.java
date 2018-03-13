package com.example.didact.u2_viewejercicio4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declarar los elementos o vistas con los que voy a trabajar
    ListView lvCiudades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificando vista
        lvCiudades = (ListView)findViewById(R.id.lvListaCiudades);

        //Datos a mostrar en el ListView
        String[] ciudades = {"Cádiz","Malaga","Huelva","Almería",
                            "Jaén","Córdoba","Madrid","Valencia",
                            "Barcelona","San Sebartián","Bilbao"};

        //Creamos el adaptador
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,ciudades);

        //Añadir el adaptador al ListView
        lvCiudades.setAdapter(adaptador);

        //Añadir el evento
        lvCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"Has pulsado un item",Toast.LENGTH_LONG).show();

                String ciudad_seleccionada = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Has seleccionado "+ciudad_seleccionada,Toast.LENGTH_LONG).show();

            }
        });

        //Añadir el evento click largo
        lvCiudades.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Has realizado un click largo", Toast.LENGTH_SHORT).show();
                return true;
            }
        });



    }//fin onCreate
}// fin MainActivity
