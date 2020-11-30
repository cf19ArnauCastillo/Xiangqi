package com.example.xiangqi.Piezas;

public class Elefante extends Pieza {
    public Elefante(int color) {
        super(color);

        if (color == 1) {
            name = "rojoelefante";
        } else {
            name = "negroelefante";
        }
    }

    @Override
    public void printGhost(int row, int col, Pieza[][] tablero, int color) {

    }
}