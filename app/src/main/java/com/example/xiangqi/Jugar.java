package com.example.xiangqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @Arnau_Castillo
 */
public class Jugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);

        String nombre = "";
        String nombre2 = "";
        String color1 = "";
        String color2 = "";

        final EditText jugador1 = findViewById(R.id.nplayer1);
        final EditText jugador2 = findViewById(R.id.nplayer2);

        final Button guardar1 = findViewById(R.id.infoplayer1);
        final Button guardar2 = findViewById(R.id.infoplayer2);
        guardar1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String nplayer1 = jugador1.getText().toString();
                String nplayer2 = jugador2.getText().toString();

                if (nplayer1!=("")) {
                    //LOGIN OK
                    //Aqui podemos hacer que salga un mensajito un momento abajo    resultat.setText("Login OK");
                    goToTablero();
                }else{
                    //LOGIN NO OK
                    //ESTO EN EL FUTURO BEIBE  resultat.setText("Login OKN'T");
                }
            }
        });
        guardar2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String nplayer2 = jugador2.getText().toString();

                if (nplayer2!=("")) {
                    //LOGIN OK
                    //Aqui podemos hacer que salga un mensajito un momento abajo    resultat.setText("Login OK");
                    goToTablero();
                }else{
                    //LOGIN NO OK
                    //ESTO EN EL FUTURO BEIBE  resultat.setText("Login OKN'T");
                }
            }
        });
    }
    public void goToTablero(){
        Intent IntentMenu = new Intent(this,Tablero.class);
        startActivity(IntentMenu);
    }
}
