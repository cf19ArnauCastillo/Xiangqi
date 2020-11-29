package com.example.xiangqi.Piezas;

public class Vasallo extends Pieza{
    public Vasallo(int color) {
        super(color);

        if (color == 1) {
            name = "vr";
        } else {
            name = "vn";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}