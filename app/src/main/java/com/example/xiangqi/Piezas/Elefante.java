package com.example.xiangqi.Piezas;

public class Elefante extends Pieza {
    public Elefante(int color) {
        super(color);

        if (color == 1) {
            name = "rojoelefante";
        } else {
            name = "blancoelefante";
        }
    }

    public void printGhost(int row, int col, Pieza[][]tablero, int color) {
//        Log.i("infoPieza", Integer.toString(row) + " -" + Integer.toString(col));

        //UF LEFT
        boolean continuar = true;
        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0 && continuar) {
            if (tablero[i][j] == null) {
                tablero[i][j] = new Ghost(color);
                i--;
                j--;
            } else {
                if(tablero[i][j].color!=color) {//si me encuentro un objeto de diferente color? se podrá comer
                    tablero[i][j].isEatable = true;
                }
                continuar = false;
            }
        }

        //UP RIGHT
        continuar = true;
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j <= 7 && continuar) {
            if (tablero[i][j] == null) {
                tablero[i][j] = new Ghost(color);
                i--;
                j++;
            } else {
                if(tablero[i][j].color!=color) {//si me encuentro un objeto de diferente color? se podrá comer
                    tablero[i][j].isEatable = true;
                }
                continuar = false;
            }
        }

        //DOWN LEFT
        continuar = true;
        i = row + 1;
        j = col - 1;
        while (i <= 7 && j >= 0 && continuar) {
            if (tablero[i][j] == null) {
                tablero[i][j] = new Ghost(color);
                i++;
                j--;
            } else {
                if(tablero[i][j].color!=color) {//si me encuentro un objeto de diferente color? se podrá comer
                    tablero[i][j].isEatable = true;
                }
                continuar = false;
            }
        }

        //DOWN RIGHT
        continuar = true;
        i = row + 1;
        j = col + 1;
        while (i <= 7 && j <= 7 && continuar) {
            if (tablero[i][j] == null) {
                tablero[i][j] = new Ghost(color);
                i++;
                j++;
            } else {
                if(tablero[i][j].color!=color) {//si me encuentro un objeto de diferente color? se podrá comer
                    tablero[i][j].isEatable = true;
                }
                continuar = false;
            }
        }
    }
}