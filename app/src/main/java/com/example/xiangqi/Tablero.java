package com.example.xiangqi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
    ImageView viewtablero[][] = new ImageView[10][9]; //De largo contando el rio son 11 Arnau tenlo en cuenta

    Pieza[][] tablero = new Pieza[10][9];

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

        viewtablero[2][0] = findViewById(R.id.a3);
        viewtablero[2][1] = findViewById(R.id.b3);
        viewtablero[2][2] = findViewById(R.id.c3);
        viewtablero[2][3] = findViewById(R.id.d3);
        viewtablero[2][4] = findViewById(R.id.e3);
        viewtablero[2][5] = findViewById(R.id.f3);
        viewtablero[2][6] = findViewById(R.id.g3);
        viewtablero[2][7] = findViewById(R.id.h3);
        viewtablero[2][8] = findViewById(R.id.i3);

        viewtablero[3][0] = findViewById(R.id.a4);
        viewtablero[3][1] = findViewById(R.id.b4);
        viewtablero[3][2] = findViewById(R.id.c4);
        viewtablero[3][3] = findViewById(R.id.d4);
        viewtablero[3][4] = findViewById(R.id.e4);
        viewtablero[3][5] = findViewById(R.id.f4);
        viewtablero[3][6] = findViewById(R.id.g4);
        viewtablero[3][7] = findViewById(R.id.h4);
        viewtablero[3][8] = findViewById(R.id.i4);

        viewtablero[4][0] = findViewById(R.id.a5);
        viewtablero[4][1] = findViewById(R.id.b5);
        viewtablero[4][2] = findViewById(R.id.c5);
        viewtablero[4][3] = findViewById(R.id.d5);
        viewtablero[4][4] = findViewById(R.id.e5);
        viewtablero[4][5] = findViewById(R.id.f5);
        viewtablero[4][6] = findViewById(R.id.g5);
        viewtablero[4][7] = findViewById(R.id.h5);
        viewtablero[4][8] = findViewById(R.id.i5);

        viewtablero[5][0] = findViewById(R.id.a6);
        viewtablero[5][1] = findViewById(R.id.b6);
        viewtablero[5][2] = findViewById(R.id.c6);
        viewtablero[5][3] = findViewById(R.id.d6);
        viewtablero[5][4] = findViewById(R.id.e6);
        viewtablero[5][5] = findViewById(R.id.f6);
        viewtablero[5][6] = findViewById(R.id.g6);
        viewtablero[5][7] = findViewById(R.id.h6);
        viewtablero[5][8] = findViewById(R.id.i6);

        viewtablero[6][0] = findViewById(R.id.a7);
        viewtablero[6][1] = findViewById(R.id.b7);
        viewtablero[6][2] = findViewById(R.id.c7);
        viewtablero[6][3] = findViewById(R.id.d7);
        viewtablero[6][4] = findViewById(R.id.e7);
        viewtablero[6][5] = findViewById(R.id.f7);
        viewtablero[6][6] = findViewById(R.id.g7);
        viewtablero[6][7] = findViewById(R.id.h7);
        viewtablero[6][8] = findViewById(R.id.i7);

        viewtablero[7][0] = findViewById(R.id.a8);
        viewtablero[7][1] = findViewById(R.id.b8);
        viewtablero[7][2] = findViewById(R.id.c8);
        viewtablero[7][3] = findViewById(R.id.d8);
        viewtablero[7][4] = findViewById(R.id.e8);
        viewtablero[7][5] = findViewById(R.id.f8);
        viewtablero[7][6] = findViewById(R.id.g8);
        viewtablero[7][7] = findViewById(R.id.h8);
        viewtablero[7][8] = findViewById(R.id.i8);

        viewtablero[8][0] = findViewById(R.id.a9);
        viewtablero[8][1] = findViewById(R.id.b9);
        viewtablero[8][2] = findViewById(R.id.c9);
        viewtablero[8][3] = findViewById(R.id.d9);
        viewtablero[8][4] = findViewById(R.id.e9);
        viewtablero[8][5] = findViewById(R.id.f9);
        viewtablero[8][6] = findViewById(R.id.g9);
        viewtablero[8][7] = findViewById(R.id.h9);
        viewtablero[8][8] = findViewById(R.id.i9);

        viewtablero[9][0] = findViewById(R.id.a10);
        viewtablero[9][1] = findViewById(R.id.b10);
        viewtablero[9][2] = findViewById(R.id.c10);
        viewtablero[9][3] = findViewById(R.id.d10);
        viewtablero[9][4] = findViewById(R.id.e10);
        viewtablero[9][5] = findViewById(R.id.f10);
        viewtablero[9][6] = findViewById(R.id.g10);
        viewtablero[9][7] = findViewById(R.id.h10);
        viewtablero[9][8] = findViewById(R.id.i10);

        //Torres
        tablero[9][0] = new Torre(0);
        tablero[9][8] = new Torre(0);
        tablero[0][0] = new Torre(1);
        tablero[0][8] = new Torre(1);

        //Caballos
        tablero[9][1] = new Caballo(0);
        tablero[9][7] = new Caballo(0);
        tablero[0][1] = new Caballo(1);
        tablero[0][7] = new Caballo(1);

        //Elefante
        tablero[9][2] = new Elefante(0);
        tablero[9][6] = new Elefante(0);
        tablero[0][2] = new Elefante(1);
        tablero[0][6] = new Elefante(1);

        //Vasallos
        tablero[9][3] = new Vasallo(0);
        tablero[9][5] = new Vasallo(0);
        tablero[0][3] = new Vasallo(1);
        tablero[0][5] = new Vasallo(1);

        //Rey
        tablero[9][4] = new Rey(0);
        tablero[0][4] = new Rey(1);

        //Cañones
        tablero[7][1] = new Canon(0);
        tablero[7][7] = new Canon(0);
        tablero[2][1] = new Canon(1);
        tablero[2][7] = new Canon(1);

        //Peones
        tablero[6][0]= new Peon(0);
        tablero[6][2]=new Peon(0);
        tablero[6][4]= new Peon(0);
        tablero[6][6]=new Peon(0);
        tablero[6][8] = new Peon(0);
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
        String row ="TABLERO\n";
        for(int i=0; i<10; i++) {
            for(int j=0; j<9; j++) {

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
                        viewtablero[i][j].setBackgroundColor(Color.parseColor("#00000000"));//aqui se cambia el color del ghost

                    }

                } else {
                    row += "   ";
                    Log.i("infoTablero", "" + i + " - " + j);
                    viewtablero[i][j].setBackgroundColor(Color.parseColor("#00000000"));//aqui se cambia el color del ghost
                }
            }
            row += "\n";
        }
        Log.i("infoTablero", row);
    }

    public void cleanTablero() {
        for(int i=0; i<10; i++) {
            for (int j = 0; j < 9; j++) {
                // Modificar array datos
                if(tablero[i][j]!=null && tablero[i][j].name.equals("G")) {
                    tablero[i][j]=null;
                } else if(tablero[i][j]!=null && tablero[i][j].isEatable==true) {
                    tablero[i][j].isEatable=false;
                }

                //Modificar array Image View TABLERO
                viewtablero[i][j].setImageResource(getResources().getIdentifier("", "drawable", getPackageName()));

            }
        }
    }
}