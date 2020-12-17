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

    public void printGhost(int row, int col, Pieza[][]tablero, int color){
//        Log.i("infoPieza", Integer.toString(row) + " -" + Integer.toString(col));
        int iniciador=2;
//ESTO NO SE USA EN ESTE AJEDREZ CHINO PERO SE QUEDA AQUI PORQUE LO NECESITO
        //UP PEON BLANCO INICIAL
        int i = row-1;
        int j = col;
        if (color==0) {
            createGhost(row - 1, col, color, tablero);
        }
        // si row-1 i col +1 o -1 tiene una pieza del color inverso la podéis comer


        //UP PEON ROJO INICIAL
        i = row+1;
        j = col;
        if (color==1) {
            createGhost(row + 1, col, color, tablero);
        }
    }

    //METODO PARA QUE CREAR GHOSTS
    public void createGhost(int row,int col,int color,Pieza[][] tablero){
        if(row>=0 && row<=9 && col >=0 && col <=9){
            if(tablero[row][col]==null) {
                tablero[row][col] = new Ghost(color);
            }
        }

        //IF PARA COMER EN DIAGONAL BLANCAS
        if(color==0) {
            int i = row;
            int j = col - 1;
            int s = col + 1;

            //Log.i("infoTaulell", Integer.toString(i) + " // " + Integer.toString(j) +  " // " + Integer.toString(s));


            if (i >= 0 && i <= 9 && j >= 0 && j <= 9){
                if (tablero[i][j] != null && tablero[i][j].color != color) {
                    tablero[i][j].isEatable = true;
                }
            }

            if(i >= 0 && i <= 9 && s >= 0 && s <= 9){
                if (tablero[i][s] != null  && tablero[i][s].color != color) {
                    tablero[i][s].isEatable = true;
                }
            }
        }
        //IF PARA COMER EN DIAGONAL ROJAS
        if(color==1) {
            int i = row;
            int j = col - 1;
            int s = col + 1;

            if (i >= 0 && i <= 9 && j >= 0 && j <= 9){
                if (tablero[i][j] != null && tablero[i][j].color != color) {
                    tablero[i][j].isEatable = true;
                }
            }

            if(i >= 0 && i <= 9 && s >= 0 && s <= 9){
                if (tablero[i][s] != null  && tablero[i][s].color != color) {
                    tablero[i][s].isEatable = true;
                }
            }
        }
    }
}