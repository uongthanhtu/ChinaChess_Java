/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.chess;

import src.board.ChessBoard;

/**
 *
 * @author Tusry
 */
public class Rook extends Piece {
    
    public Rook( String color, int x, int y) {
        super("XE", color, x, y);
    }
    
    @Override
    public boolean isValidMove(int newMoveX, int newMoveY, Piece[][] board) {
        boolean flagCheckExits = false;
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
            }else if(x == posMaxX){
                posMaxX = posMaxX - 1;
            }
            for (int i = posMinX; i <= posMaxX; i++) {
                if(i == posMinX){
                    if(flagCheckExits == false && x == posMaxX + 1 && board[posMinX][y] != null){
                        if(!board[posMinX][y].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                    }
                }
                if (i == posMaxX){
                    if(flagCheckExits == false && x == posMinX - 1 && board[posMaxX][y] != null){
                        if(!board[posMaxX][y].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                    }
                }
                if(board[i][y] != null){
                    flagCheckExits = true;
                }
            }
            if(flagCheckExits) return false;
        }
        
        if(newMoveY != y){
            int posMinY = Math.min(newMoveY, y);
            int posMaxY = Math.max(newMoveY, y);
            if(y == posMinY){
                posMinY = posMinY + 1;
            }else if(y == posMaxY){
                posMaxY = posMaxY - 1;
            }
            for (int i = posMinY; i <= posMaxY; i++) {
                if(i == posMinY){
                    if(flagCheckExits == false && y == posMaxY + 1 && board[x][posMinY] != null){
                        if(!board[x][posMinY].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                    }
                }
                if (i == posMaxY){
                    if(flagCheckExits == false && y == posMinY - 1 && board[x][posMaxY] != null){
                        if(!board[x][posMaxY].getColor().equalsIgnoreCase(board[x][y].getColor())){
                            return true;
                        }
                    }
                }
                if(board[x][i] != null){
                    flagCheckExits = true;
                }
            }
            if(flagCheckExits) return false;
        }
        return true;
        
    }

    @Override
    public void move(int newMoveX, int newMoveY, Piece[][] board) {
        super.move(newMoveX, newMoveY, board);
    }
        @Override
    public String toString() {
        return (color.equals("Do") ? "R" : "r");
    }
    
}
