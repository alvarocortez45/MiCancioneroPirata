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
            "Gingerbread v2.2", "Honeycomb v3.0/3.1"};

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
