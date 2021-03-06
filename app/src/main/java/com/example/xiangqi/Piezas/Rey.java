package com.example.xiangqi.Piezas;

public class Rey extends  Pieza {
    public Rey(int color) {
        super(color);

        if (color == 1) {
            name = "rojorey";
        } else {
            name = "blancorey";
        }
    }

    public void printGhost(int row, int col, Pieza[][]tablero, int color){
//        Log.i("infoPieza", Integer.toString(row) + " -" + Integer.toString(col));

        createGhost(row+0,col+1,color,tablero);
        createGhost(row+0,col-1,color,tablero);
        createGhost(row+1,col+0,color,tablero);
        createGhost(row-1,col-0,color,tablero);
    }
    public void createGhost(int row,int col,int color,Pieza[][] tablero){
        if(color==1 && row>=0 && row<=2 && col >=3 && col <=5){
            if(tablero[row][col]==null){
                tablero[row][col]=new Ghost(color);
            }else{
                if(tablero[row][col].color!=this.color){
                    tablero[row][col].isEatable=true;
                }
            }
        }
        if(color==0 && row>=7 && row<=9 && col >=3 && col <=5){
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