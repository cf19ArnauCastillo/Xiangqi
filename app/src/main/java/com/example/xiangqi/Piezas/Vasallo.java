package com.example.xiangqi.Piezas;

public class Vasallo extends Pieza {
    public Vasallo(int color) {
        super(color);

        if (color == 1) {
            name = "rojovasallo";
        } else {
            name = "blancovasallo";
        }
    }

    public void printGhost(int row, int col, Pieza[][] tablero, int color) {
//        Log.i("infoPieza", Integer.toString(row) + " -" + Integer.toString(col));
        int iniciador = 2;
//ESTO NO SE USA EN ESTE AJEDREZ CHINO PERO SE QUEDA AQUI PORQUE LO NECESITO
        //UP PEON BLANCO INICIAL
        int i = row - 1;
        int j = col;
        if (color == 0) {
            createGhost(row - 1, col, color, tablero);


            if (color == 1 && row == 6) {
                createGhost(row - 1, col, color, tablero);
            }
        }
        // si row-1 i col +1 o -1 tiene una pieza del color inverso la podéis comer


        //UP PEON ROJO INICIAL
        i = row + 1;
        j = col;
        if (color == 1) {
            createGhost(row + 1, col, color, tablero);

            if (color == 0 && row == 1) {
                createGhost(row + 1, col, color, tablero);
            }
        }
    }

    private void createGhost(int i, int col, int color, Pieza[][] tablero) {
    }
}
