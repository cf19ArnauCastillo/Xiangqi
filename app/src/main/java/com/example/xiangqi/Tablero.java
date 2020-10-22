package com.example.xiangqi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Tablero extends AppCompatActivity {

    TextView n1, n2;
    String sn1, sn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);

        n1=(TextView) findViewById(R.id.nombre1);
        n2=(TextView) findViewById(R.id.nombre2);

        sn1=getIntent().getExtras().getString("NombreJ1");
        n1.setText(sn1);

        sn2=getIntent().getExtras().getString("NombreJ2");
        n2.setText(sn2);
    }
}