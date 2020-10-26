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
        name1="";
        name2="";
        guardar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name1 = jugador1.getText().toString();
                if (name1.equals("")) {
                    //LOGIN NO OK
                    resultat.setText("No has puesto ningun nombre!");
                }
                //Llamar metodo intent
                checkIntent();
            }
        });

        guardar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name2 = jugador2.getText().toString();
                if (name2.equals("")) {
                    //LOGIN NO OK
                    resultat.setText("No has puesto ningun nombre!");
                }
                checkIntent();
            }
        });
    }


    public void checkIntent(){
        if(!name1.equals("") && !name2.equals("")){
            Intent pasarnombre = new Intent(Jugar.this, Tablero.class);
            pasarnombre.putExtra("NombreJ1", name1);
            pasarnombre.putExtra("NombreJ2", name2);

            startActivity(pasarnombre);
            finish();
        }
    }
}
