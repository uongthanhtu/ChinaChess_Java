/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.chess;

import src.board.ChessBoard;

/**
 *
 * @author ADMIN
 */
public class Rook extends Piece {
    
    public Rook( String color, int x, int y) {
        super("XE", color, x, y);
    }
    
    @Override
    public boolean isValidMove(int newMoveX, int newMoveY, Piece[][] board) {
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
                if(board[i][y] != null){
                    return false;
                }
            }   
        }
        if(newMoveY != y){
            int posMinY = Math.min(newMoveY, y);
            int posMaxY = Math.max(newMoveY, y);
            System.out.println(posMinY + " " + posMaxY);
            if(y == posMinY){
                posMinY = posMinY + 1;
            }else if(y == posMaxY){
                posMaxY = posMaxY - 1;
            }
            for (int i = posMinY; i <= posMaxY; i++) {
                if(board[x][i] != null){
                    return false;
                }
            }
        }
        return true;
        
    }

    @Override
    public void move(int newMoveX, int newMoveY, Piece[][] board) {
        super.move(newMoveX, newMoveY, board); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
        @Override
    public String toString() {
        return (color.equals("Do") ? "R" : "r");
    }
    
}
