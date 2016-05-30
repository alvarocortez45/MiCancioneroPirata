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
            letraView.setText(R.string.pajaritos_en_el_aire);
            url="https://youtu.be/Nb7vtYTnz8A" ;
        }
        if (titulo_cancion.equals("Hay que alentar hasta la muerte")){
            letraView.setText(R.string.hay_que_alentar_hasta_la_muerte);
            url="https://youtu.be/awrlqs_FhV8" ;
        }
        if (titulo_cancion.equals("Vos sos la alegría de mi corazón")) {
            letraView.setText(R.string.vos_sos_la_alegria_de_mi_corazon);
            url = "https://youtu.be/ZK5qoSwOcFA";
        }
        if (titulo_cancion.equals("Ya llego la banda")) {
            letraView.setText(R.string.ya_llego_la_banda);
            url = "https://youtu.be/bQRO5HZgeK4";
        }
        if (titulo_cancion.equals("Ya volvimos otra vez")) {
            letraView.setText(R.string.ya_volvimos_otra_vez);
            url = "https://youtu.be/YQ_k0339Gws";
        }
        if (titulo_cancion.equals("Yo siempre te voy a alentar")) {
            letraView.setText(R.string.yo_siempre_te_voy_a_alentar);
            url = "https://youtu.be/AKxp3n9S91s";
        }
        if (titulo_cancion.equals("No le falles a tu gente")) {
            letraView.setText(R.string.no_le_falles_a_tu_gente);
            url = "https://youtu.be/pVZH33DV1ZU";
        }
        if (titulo_cancion.equals("Somos lo mas grande del futbol nacional")) {
            letraView.setText(R.string.somos_lo_mas_grande_del_futbol_nacional);
            url = "https://youtu.be/IA_7Q15haJY";
        }
        if (titulo_cancion.equals("Juegue dejando la vida")) {
            letraView.setText(R.string.juegue_dejando_la_vida);
            url = "https://youtu.be/fCc42Ue_dOA";
        }
        if (titulo_cancion.equals("El orgullo de ser hincha de Belgrano")) {
            letraView.setText(R.string.el_orgullo_de_ser_hincha_de_belgrano);
            url = "https://youtu.be/w6SU17AdSq4";
        }
        if (titulo_cancion.equals("De pronto llega el domingo")) {
            letraView.setText(R.string.de_pronto_llega_el_domingo);
            url = "https://youtu.be/EkxRszIB9LY";
        }
        if (titulo_cancion.equals("Vamos Belgrano cada dia te quiero mas")) {
            letraView.setText(R.string.vamos_belgrano_cada_dia_te_quiero_mas);
            url = "https://youtu.be/YcuMfQVRgxM";
        }
        if (titulo_cancion.equals("Viejo y glorioso Belgrano")) {
            letraView.setText(R.string.viejo_glorioso_belgrano);
            url = "https://youtu.be/j1o-I51_qUU";
        }
        if (titulo_cancion.equals("De la cabeza")) {
            letraView.setText(R.string.de_la_cabeza);
            url = "https://youtu.be/JCn2VTJKK64";
        }
        if (titulo_cancion.equals("Es una locura que no tiene cura")) {
            letraView.setText(R.string.es_una_locura_que_no_tiene_cura);
            url = "https://youtu.be/BE657X12qEo";
        }
        if (titulo_cancion.equals("No le falles a tu hinchada")) {
            letraView.setText(R.string.no_le_falles_a_tu_hinchada);
            url = "https://youtu.be/2g45GCntm2Q";
        }
        if (titulo_cancion.equals("Somos de la gloriosa")) {
            letraView.setText(R.string.somos_de_la_gloriosa);
            url = "https://youtu.be/F87h2ytFTy8";
        }
        if (titulo_cancion.equals("En Alberdi todo el año es carnaBal")) {
            letraView.setText(R.string.en_alberdi_todo_el_año_es_carnabal);
            url = "https://youtu.be/PT-mqsri2Mw";
        }
        if (titulo_cancion.equals("Por Belgrano vivire")) {
            letraView.setText(R.string.por_belgrano_vivire);
            url = "https://youtu.be/a3SCJ5XSPdk";
        }
        if (titulo_cancion.equals("Soy de Belgrano")) {
            letraView.setText(R.string.soy_de_belgrano);
            url = "https://youtu.be/XCvhOF44goo";
        }
        if (titulo_cancion.equals("Hay una banda que te sigue siempre a todos lados")) {
            letraView.setText(R.string.hay_una_banda_que_te_sigue_siempre_a_todos_lados);
            url = "https://youtu.be/SD9H4QXh-hU";
        }
        if (titulo_cancion.equals("Todos los domingos")) {
            letraView.setText(R.string.todos_los_domingos);
            url = "https://youtu.be/ju8VyULdQWY";
        }
        if (titulo_cancion.equals("No se como voy")) {
            letraView.setText(R.string.no_se_como_voy);
            url = "https://youtu.be/jDd8kH8JfeY";
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

    public void share(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_TEXT, letraView.getText());
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}
