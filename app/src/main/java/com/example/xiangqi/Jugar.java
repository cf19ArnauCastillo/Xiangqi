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

    Button guardar1, guardar2;
    EditText jugador1, jugador2;
    TextView resultat;
    String name1, name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);

        jugador1=(EditText)findViewById(R.id.nplayer1);
        jugador2=(EditText)findViewById(R.id.nplayer2);
        guardar1=(Button)findViewById(R.id.infoplayer1);
        guardar2=(Button)findViewById(R.id.infoplayer2);
        resultat=(TextView)findViewById(R.id.Resultat);

        guardar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jugador1.equals("")) {
                    //LOGIN NO OK
                    resultat.setText("No has puesto ningun nombre!");

                }else{
                    Intent pasarnombre = new Intent(Jugar.this, Tablero.class);
                    name1 = jugador1.getText().toString();
                    pasarnombre.putExtra("NombreJ1", name1);
                    startActivity(pasarnombre);
                    finish();
                }
            }
        });

        guardar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jugador1.equals("")) {
                    //LOGIN NO OK
                    resultat.setText("No has puesto ningun nombre!");

                }else {
                    Intent pasarnombre = new Intent(Jugar.this, Tablero.class);
                    name2 = jugador2.getText().toString();
                    pasarnombre.putExtra("NombreJ2", name2);
                    startActivity(pasarnombre);
                    finish();
                }
            }
        });
    }
}
