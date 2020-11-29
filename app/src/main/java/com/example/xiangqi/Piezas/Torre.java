package com.example.xiangqi.Piezas;

public class Torre extends Pieza {
    //Classe Torre
    public Torre(int color) {
        super(color);

        if (color == 1) {
            name = "tr";
        } else {
            name = "tn";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}