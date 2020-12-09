package com.example.xiangqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * @Arnau_Castillo
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.jugar);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToPlay();
            }
        });

        final Button button2 = findViewById(R.id.ajuda);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToAjuda();
            }
        });

        final Button button3 = findViewById(R.id.sobremi);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToSobremi();
            }
        });

    }
    public void goToPlay(){
        Intent IntentMenu = new Intent(this,Tablero.class);
        startActivity(IntentMenu);
    }
    public void goToAjuda(){
        Intent IntentMenu = new Intent(this,Ajuda.class);
        startActivity(IntentMenu);
    }
    public void goToSobremi(){
        Intent IntentMenu = new Intent(this,SobreNosaltres.class);
        startActivity(IntentMenu);
    }
}