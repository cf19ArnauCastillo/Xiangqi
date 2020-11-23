package com.example.xiangqi.Piezas;

public abstract class Pieza {

    //Classe mare peces
    public int color=-1;            //Rojo (1) o negro (0)
    public String name="";          //Nombre para imprimir


    public boolean isEatable=false;

    public Pieza(int color){      //Constructor
        this.color = color;
    }

    public abstract void printGhost(int row, int col, Pieza[][] tablero, int color);
}
