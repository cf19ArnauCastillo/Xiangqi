package com.example.xiangqi.Piezas;

public class Torre extends Pieza {
    //Classe Torre
    public Torre(int color) {
        super(color);

        if (color == 1) {
            name = "rojotorre";
        } else {
            name = "blancotorre";
        }
    }

    public void printGhost(int row, int col, Pieza[][]tablero, int color) {
//        Log.i("infoPieza", Integer.toString(row) + " -" + Integer.toString(col));

        //UP
        boolean continuar = true;
        int i = row - 1; //dibuja la linea recta de la torre
        while (i >= 0 && continuar) {
            if (tablero[i][col] == null) {//si las casillas estan vacias lo colorea el ghost
                tablero[i][col] = new Ghost(color);
                i--;
            } else {//cuando i ya no sea superior a cero
                if(tablero[i][col].color!=color) {//si me encuentro un objeto de diferente color? se podrá comer
                    tablero[i][col].isEatable = true;
                }
                continuar = false;//termina el ciclo
            }
        }


        //LEFT
        continuar = true;
        int j = col - 1;
        // tablero[i][col].isEatable = false;
        while (j >= 0 && continuar) {
            if (tablero[row][j] == null) {
                tablero[row][j] = new Ghost(color);
                j--;
            } else {
                if(tablero[row][j].color!=color) {//si me encuentro un objeto de diferente color? se podrá comer
                    tablero[row][j].isEatable = true;
                }
                continuar = false;
            }
        }

        //RIGHT
        j = col + 1;
        continuar = true;
        while (j <= 7 && continuar) {
            if (tablero[row][j] == null) {
                tablero[row][j] = new Ghost(color);
                j++;
            } else {
                if(tablero[row][j].color!=color) {//si me encuentro un objeto de diferente color? se podrá comer
                    tablero[row][j].isEatable = true;
                }
                continuar = false;
            }
        }

        //LEFT
        continuar = true;
        i = row + 1; //dibuja la linea recta de la torre
        while (i <= 7 && continuar) {
            if (tablero[i][col] == null) {//si las casillas estan vacias lo colorea el ghost
                tablero[i][col] = new Ghost(color);
                i++;
            } else {
                if(tablero[i][col].color!=color) {//si me encuentro un objeto de diferente color? se podrá comer
                    tablero[i][col].isEatable = true;
                }
                continuar = false;//termina el ciclo
            }
        }
    }
}