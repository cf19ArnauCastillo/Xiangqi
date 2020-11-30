package com.example.xiangqi.Piezas;

public class Caballo extends Pieza {
    public Caballo(int color) {
        super(color);

        if (color == 1) {
            name = "rojocaballo";
        } else {
            name = "negrocaballo";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}
