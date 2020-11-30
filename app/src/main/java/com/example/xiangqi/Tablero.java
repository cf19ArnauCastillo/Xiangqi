package com.example.xiangqi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xiangqi.Piezas.Caballo;
import com.example.xiangqi.Piezas.Canon;
import com.example.xiangqi.Piezas.Elefante;
import com.example.xiangqi.Piezas.Peon;
import com.example.xiangqi.Piezas.Pieza;
import com.example.xiangqi.Piezas.Rey;
import com.example.xiangqi.Piezas.Torre;
import com.example.xiangqi.Piezas.Vasallo;

public class Tablero extends AppCompatActivity {

    //CANTIDAD DE CASILLAS PARA MOVER LAS FICHAS
    ImageView viewtablero[][] = new ImageView[9][10]; //De largo contando el rio son 11 Arnau tenlo en cuenta

    Pieza[][] tablero = new Pieza[9][10];

    int row2;
    int col2;
    //PARA VER LOS NOMBRES DE LOS JUGADORES
    TextView n1, n2;
    String sn1, sn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);

        //PARA VER LOS NOMBRES DE LOS JUGADORES
        n1=(TextView) findViewById(R.id.nombre1);
        n2=(TextView) findViewById(R.id.nombre2);

        sn1=getIntent().getExtras().getString("NombreJ1");
        n1.setText(sn1);

        sn2=getIntent().getExtras().getString("NombreJ2");
        n2.setText(sn2);

        //PARA PODER MOVER LAS FICHAS
        viewtablero[0][0] = findViewById(R.id.a1);
        viewtablero[0][1] = findViewById(R.id.b1);
        viewtablero[0][2] = findViewById(R.id.c1);
        viewtablero[0][3] = findViewById(R.id.d1);
        viewtablero[0][4] = findViewById(R.id.e1);
        viewtablero[0][5] = findViewById(R.id.f1);
        viewtablero[0][6] = findViewById(R.id.g1);
        viewtablero[0][7] = findViewById(R.id.h1);
        viewtablero[0][8] = findViewById(R.id.i1);

        viewtablero[1][0] = findViewById(R.id.a2);
        viewtablero[1][1] = findViewById(R.id.b2);
        viewtablero[1][2] = findViewById(R.id.c2);
        viewtablero[1][3] = findViewById(R.id.d2);
        viewtablero[1][4] = findViewById(R.id.e2);
        viewtablero[1][5] = findViewById(R.id.f2);
        viewtablero[1][6] = findViewById(R.id.g2);
        viewtablero[1][7] = findViewById(R.id.h2);
        viewtablero[1][8] = findViewById(R.id.i2);

        viewtablero[3][0] = findViewById(R.id.a3);
        viewtablero[3][1] = findViewById(R.id.b3);
        viewtablero[3][2] = findViewById(R.id.c3);
        viewtablero[3][3] = findViewById(R.id.d3);
        viewtablero[3][4] = findViewById(R.id.e3);
        viewtablero[3][5] = findViewById(R.id.f3);
        viewtablero[3][6] = findViewById(R.id.g3);
        viewtablero[3][7] = findViewById(R.id.h3);
        viewtablero[3][8] = findViewById(R.id.i3);

        viewtablero[4][0] = findViewById(R.id.a4);
        viewtablero[4][1] = findViewById(R.id.b4);
        viewtablero[4][2] = findViewById(R.id.c4);
        viewtablero[4][3] = findViewById(R.id.d4);
        viewtablero[4][4] = findViewById(R.id.e4);
        viewtablero[4][5] = findViewById(R.id.f4);
        viewtablero[4][6] = findViewById(R.id.g4);
        viewtablero[4][7] = findViewById(R.id.h4);
        viewtablero[4][8] = findViewById(R.id.i4);

        viewtablero[5][0] = findViewById(R.id.a5);
        viewtablero[5][1] = findViewById(R.id.b5);
        viewtablero[5][2] = findViewById(R.id.c5);
        viewtablero[5][3] = findViewById(R.id.d5);
        viewtablero[5][4] = findViewById(R.id.e5);
        viewtablero[5][5] = findViewById(R.id.f5);
        viewtablero[5][6] = findViewById(R.id.g5);
        viewtablero[5][7] = findViewById(R.id.h5);
        viewtablero[5][8] = findViewById(R.id.i5);

        //Torres
        tablero[0][0] = new Torre(1);
        tablero[0][8] = new Torre(1);

        //Caballos
        tablero[0][1] = new Caballo(1);
        tablero[0][7] = new Caballo(1);

        //Elefante
        tablero[0][2] = new Elefante(1);
        tablero[0][6] = new Elefante(1);

        //Vasallos
        tablero[0][3] = new Vasallo(1);
        tablero[0][5] = new Vasallo(1);

        //Rey
        tablero[0][4] = new Rey(1);

        //Cañones
        tablero[2][1] = new Canon(1);
        tablero[2][7] = new Canon(1);

        //Peones
        tablero[3][0]= new Peon(1);
        tablero[3][2]=new Peon(1);
        tablero[3][4]= new Peon(1);
        tablero[3][6]=new Peon(1);
        tablero[3][8] = new Peon(1);

        pintTablero();
    }
    public void clickPeca (View view) {
        String posPeca = view.getTag().toString();
        //con este codigo cogemos la posicion de la pieza y la dividimos en:row y col

        int row = Character.getNumericValue(posPeca.charAt(0));
        int col = Character.getNumericValue(posPeca.charAt(1));
        int col3=row;
        int row3=col;
        //Almacena en las variables row y col las posiciones de la pieza en el tablero
        Log.i("infoTablero", "CLICK ---->" + tablero[row][col].name);
        if(tablero[row][col]!=null) {//se activa si clicas una pieza
            //si fuese G no entraria

            if(!tablero[row][col].name.equals("G") && tablero[row][col].isEatable==false){//
                Log.i("infoTablero", "ENTRA EN CLICK PIEZA");
                cleanTablero(); //limpia los ghost.pero en la primera pieza no la hace,si en el resto
                int color = tablero[row][col].color; //el color que recibe es un 1 o 0
                tablero[row][col].printGhost(row, col, tablero, color);
                row2 = row; //fila vieja
                col2 = col; //columna vieja

            } else if(tablero[row][col].name.equals("G")) {//si una pieza es G y esta libre
                Log.i("infoTablero", "ENTRA EN CLICK GHOST");
                Log.i("infoTablero", Integer.toString(row2) + " " + Integer.toString(col2));
                //Cogemos la pieza clicada
                Pieza piezaMover = tablero[row2][col2];
                //Ponemos la pieza en la nueva casilla clicada:la antigua posicion se modifica a la del nuevo clic
                tablero[row][col] = piezaMover;
                //Eliminamos la pieza de su posición inicial
                tablero[row2][col2] = null;
                cleanTablero();

            }else if(tablero[row][col].color!=tablero[row2][col2].color && tablero[row][col].isEatable==true){
                //si son de diferente color las posiciones y la segunda es comible
                Log.i("infoTablero", "ENTRA EN CLICK KILL");
                tablero[row][col] = tablero[row2][col2];
                tablero[row2][col2] = null;
                cleanTablero();

            }
        }
        pintTablero();
    }

    public void pintTablero(){
        //Row es para el log.
        Log.i("infoTablero", "hola");
        String row ="TABLERO\n";
        for(int i=0; i<9; i++) {
            for(int j=0; j<10; j++) {

                if(tablero[i][j]!=null) {
                    row += tablero[i][j].name + " ";

                    if (tablero[i][j].name.equals("G")) {
                        //Posible movimiento
                        //Cambio de color
                        viewtablero[i][j].setBackgroundColor(Color.parseColor("#3b83bd05"));//aqui se cambia el color del ghost

                        //Pintamos de otro color si la ficha se puede comer
                    } else if (tablero[i][j].isEatable == true) {
                        viewtablero[i][j].setBackgroundColor(Color.parseColor("#80ff0000"));
                        viewtablero[i][j].setImageResource(getResources().getIdentifier(tablero[i][j].name, "drawable", getPackageName()));
                    } else {
                        Log.i("infoTablero", tablero[i][j].name + "--" + Integer.toString(i) + " " + Integer.toString(j));
                        viewtablero[i][j].setImageResource(getResources().getIdentifier(tablero[i][j].name, "drawable", getPackageName()));
                    }

                } else {
                    row += "   ";
                }
            }
            row += "\n";
        }
        Log.i("infoTablero", row);
    }

    public void cleanTablero() {
        for(int i=0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                // Modificar array datos
                if(tablero[i][j]!=null && tablero[i][j].name.equals("G")) {
                    tablero[i][j]=null;
                } else if(tablero[i][j]!=null && tablero[i][j].isEatable==true) {
                    tablero[i][j].isEatable=false;
                }
                if(tablero[i][j]==null){
                    tablero[i][j]=null;
                }

                //Modificar array Image View TABLERO
                viewtablero[i][j].setImageResource(getResources().getIdentifier("", "drawable", getPackageName()));
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        viewtablero[i][j].setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    } else {
                        viewtablero[i][j].setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                } else {
                    if (j % 2 == 0) {
                        viewtablero[i][j].setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    } else {
                        viewtablero[i][j].setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    }
                }
            }
        }
    }
}