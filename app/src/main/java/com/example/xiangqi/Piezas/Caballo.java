package com.example.xiangqi.Piezas;

public class Caballo extends Pieza {
    public Caballo(int color) {
        super(color);

        if (color == 1) {
            name = "cr";
        } else {
            name = "cn";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}
