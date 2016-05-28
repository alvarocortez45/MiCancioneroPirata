package com.example.alvaro.micancioneropirata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Visor extends AppCompatActivity {

    private TextView tituloView;
    private TextView letraView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor);
        setTitulo();
        setLetra();

    }

    public void setTitulo(){
        tituloView = (TextView)findViewById(R.id.titulo_TextView);
        Intent intent = getIntent();
        String titulo_cancion = intent.getStringExtra(Principal.EXTRA_NOMBRE);
        tituloView.setText(titulo_cancion);
    }

    public void setLetra(){
        letraView = (TextView)findViewById(R.id.Letra_TextView);
        Intent intent = getIntent();
        String titulo_cancion = intent.getStringExtra(Principal.EXTRA_NOMBRE);
        if (titulo_cancion.equals("No se compara")){
            letraView.setText("vamos, vamos, vamos los piratas!!\n" +
                    "la Banda esta alentando, \n" +
                    "copa en todas las canchas!!\n" +
                    "solo pido que vayas al frente,\n" +
                    "que juegue \"A LO BELGRANO\", te lo pide la gente!!\n" +
                    "\n" +
                    "nooooo se compara!!\n" +
                    "esta es la gloriosa primera Barra!!\n" +
                    "es diferente!! vayas donde vayas estara presente\n");
        }
    }
}
