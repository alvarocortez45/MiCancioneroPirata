package com.example.alvaro.micancioneropirata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;

public class Principal extends AppCompatActivity {

    public final static String EXTRA_NOMBRE = "Nombre";
    ListView lv;
    String[] titulo_cancion = {"No se compara", "Belgrano esta de fiesta y vos de luto", "Gallina no me jodas jamas", "Pajaritos en el aire",
            "Hay que alentar hasta la muerte", "Vos sos la alegría de mi corazón", "Ya llego la banda", "Ya volvimos otra vez", "Yo siempre te voy a alentar",
            "No le falles a tu gente", "Somos lo mas grande del futbol nacional", "Juegue dejando la vida", "El orgullo de ser hincha de Belgrano",
            "De pronto llega el domingo", "Vamos Belgrano cada dia te quiero mas", "Viejo y glorioso Belgrano", "De la cabeza",
            "Es una locura que no tiene cura", "No le falles a tu hinchada", "Somos de la gloriosa", "En Alberdi todo el año es carnaBal",
            "Por Belgrano vivire", "Soy de Belgrano", "Hay una banda que te sigue siempre a todos lados", "Todos los domingos", "No se como voy"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lv = (ListView) findViewById(R.id.list);
        final Intent intent = new Intent(this, Visor.class);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titulo_cancion));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
                intent.putExtra(EXTRA_NOMBRE, titulo_cancion[position]);
                startActivity(intent);
                }

        });

    }

}
