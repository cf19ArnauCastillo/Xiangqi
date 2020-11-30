package com.example.xiangqi.Piezas;

public class Canon extends Pieza{
    public Canon(int color) {
        super(color);

        if (color == 1) {
            name = "rojocanon";
        } else {
            name = "negrocanon";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}