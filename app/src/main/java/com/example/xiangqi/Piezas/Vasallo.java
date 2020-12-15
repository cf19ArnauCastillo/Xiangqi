package com.example.xiangqi.Piezas;

public class Vasallo extends Pieza{
    public Vasallo(int color) {
        super(color);

        if (color == 1) {
            name = "rojovasallo";
        } else {
            name = "blancovasallo";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}