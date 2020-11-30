package com.example.xiangqi.Piezas;

public class Rey extends  Pieza {
    public Rey(int color) {
        super(color);

        if (color == 1) {
            name = "rojorey";
        } else {
            name = "negrorey";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}