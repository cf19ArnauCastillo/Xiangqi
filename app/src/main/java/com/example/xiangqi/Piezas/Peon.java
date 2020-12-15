package com.example.xiangqi.Piezas;

public class Peon extends Pieza {
    public Peon(int color) {
        super(color);

        if (color == 1) {
            name = "rojopeon";
        } else {
            name = "blancopeon";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}