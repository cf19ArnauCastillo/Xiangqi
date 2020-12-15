package com.example.xiangqi.Piezas;

public class Caballo extends Pieza {
    public Caballo(int color) {
        super(color);

        if (color == 1) {
            name = "rojocaballo";
        } else {
            name = "blancocaballo";
        }
    }

    public void printGhost(int row, int col, Pieza[][] tablero, int color){
//        Log.i("infoPieza", Integer.toString(row) + " -" + Integer.toString(col));

        //Hacia arriba a la izquierda
        createGhost(row-1,col-2,color,tablero);
        //UP LEFT UP
        createGhost(row-2,col-1,color,tablero);
        //UP RIGHT UP
        createGhost(row-2,col+1,color,tablero);
        //UP RIGHT RIGHT
        createGhost(row-1,col+2,color,tablero);

        //DOWN DOWN LEFT
        createGhost(row+2,col-1,color,tablero);
        //DOWN  DOWN RIGHT
        createGhost(row+2,col+1,color,tablero);
        //DOWN LEFT LEFT
        //createGhost(row+1,col-2,color,tablero);
        //DOWN RIGHT RIGHT
        createGhost(row+1,col+2,color,tablero);

    }

    public void createGhost(int row,int col,int color,Pieza[][] tablero){
        if(row>=0 && row<=7 && col >=0 && col <=7){
            if(tablero[row][col]==null){
                tablero[row][col]=new Ghost(color);
            }else{
                if(tablero[row][col].color!=this.color){
                    tablero[row][col].isEatable=true;
                }
            }
        }
    }
}
