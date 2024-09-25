/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.chess;

/**
 *
 * @author Tusry
 */
public class Cannon extends Piece {

    public Cannon(String color, int x, int y) {
        super("Phao", color, x, y);
    }

    @Override
    public boolean isValidMove(int newMoveX, int newMoveY, Piece[][] board) {
        int flagCheckExits = 0;
        if(newMoveX == x && newMoveY == y){
            return false;
        }
        if(newMoveX != x && newMoveY != y){
            return false;
        }
        if(newMoveX != x){
            int posMinX = Math.min(newMoveX, x);
            int posMaxX = Math.max(newMoveX, x);
            if(x == posMinX){
                posMinX = posMinX + 1;
            }else {
                posMaxX = posMaxX - 1;
            }
            System.out.println(posMaxX + " " + posMinX);
            for(int i = posMinX ; i<= posMaxX; i++){
                if(i == posMinX){
                    if(flagCheckExits == 1 && x == posMaxX + 1 && board[posMinX][y] != null){
                        if(!board[posMinX][y].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                        return false;
                    }
                }
                if (i == posMaxX){
                    if(flagCheckExits == 1 && x == posMinX - 1 && board[posMaxX][y] != null){
                        if(!board[posMaxX][y].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                        return false;
                    }
                    if((flagCheckExits == 2 || (flagCheckExits == 1 && board[posMaxX][y] != null) ) && x == posMaxX + 1
                                                                                        && board[posMinX][y] != null){
                        if(!board[posMinX][y].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                        return false;
                    }
                    if(board[posMaxX][y] != null && flagCheckExits == 0) return false;
                    if(flagCheckExits >= 1) return false;
                }
                if(board[i][y] != null){
                    flagCheckExits ++;
                }
            }
        }

        if(newMoveY != y){
            int posMinY = Math.min(newMoveY, y);
            int posMaxY = Math.max(newMoveY, y);
            if(y == posMinY){
                posMinY = posMinY + 1;
            }else {
                posMaxY = posMaxY - 1;
            }
            for(int i = posMinY ; i<= posMaxY; i++){
                if(i == posMinY){
                    if(flagCheckExits == 1 && y == posMaxY + 1 && board[x][posMinY] != null){
                        if(!board[x][posMinY].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                        return false;
                    }
                }
                if (i == posMaxY){
                    if(flagCheckExits == 1 && y == posMinY - 1 && board[x][posMaxY] != null){
                        if(!board[x][posMaxY].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                        return false;
                    }
                    if((flagCheckExits == 2 || (flagCheckExits == 1 && board[x][posMaxY] != null)) && y == posMaxY + 1
                                                                                        && board[x][posMinY] != null){
                        if(!board[x][posMinY].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                        return false;
                    }
                    if(board[x][posMaxY] != null && flagCheckExits == 0) return false;
                    if(flagCheckExits >= 1) return false;
                }
                if(board[x][i] != null){
                    flagCheckExits ++;
                    if(flagCheckExits > 2) return false;
                }
            }
        }
        return true;
    }
    
        @Override
    public String toString() {
        return (color.equals("Do") ? "C" : "c");
    }
    
}
