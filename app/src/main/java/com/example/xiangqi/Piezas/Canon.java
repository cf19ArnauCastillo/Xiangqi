package com.example.xiangqi.Piezas;

public class Canon extends Pieza{
    public Canon(int color) {
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