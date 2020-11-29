package com.example.xiangqi.Piezas;

public class Rey extends  Pieza {
    public Rey(int color) {
        super(color);

        if (color == 1) {
            name = "rr";
        } else {
            name = "rn";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}