package com.example.alvaro.micancioneropirata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Visor extends AppCompatActivity {

    private TextView tituloView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor);
        tituloView = (TextView)findViewById(R.id.titulo_TextView);
        Intent intent = getIntent();
        String titulo_cancion = intent.getStringExtra(Principal.EXTRA_NOMBRE);
        tituloView.setText(titulo_cancion);





    }


    public void setView(){

    }


}
