package com.example.alvaro.micancioneropirata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Visor extends ActionBarActivity {
    String url="";
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

    public String setLetra(){
        letraView = (TextView)findViewById(R.id.Letra_TextView);
        Intent intent = getIntent();
        String titulo_cancion = intent.getStringExtra(Principal.EXTRA_NOMBRE);
        if (titulo_cancion.equals("No se compara")){
            letraView.setText(R.string.no_se_compara);
            url = "https://www.youtube.com/watch?v=Oo541M6emKw";
        }
        if (titulo_cancion.equals("Belgrano esta de fiesta y vos de luto")){
            letraView.setText(R.string.belgrano_esta_de_fiesta_y_vos_de_luto);
            url = "https://www.youtube.com/watch?v=4RHDlJmpQyc";
        }
        if (titulo_cancion.equals("Gallina no me jodas jamas")){
            letraView.setText(R.string.gallina_no_me_jodas_jamas);
            url= "https://youtu.be/0-XOgHcELoE";
        }
        if (titulo_cancion.equals("Pajaritos en el aire")){
            letraView.setText(R.string.gallina_no_me_jodas_jamas);
            url="https://youtu.be/Nb7vtYTnz8A" ;
        }


        return url;
    }

    public void openWebPage(View view) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
