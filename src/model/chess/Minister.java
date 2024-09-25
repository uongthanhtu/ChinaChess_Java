/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.chess;

/**
 *
 * @author Tusry
 */
public class Minister extends Piece{

    public Minister(String color, int x, int y) {
        super("Si", color, x, y);
    }    
    
    @Override
    public boolean isValidMove(int newMoveX, int newMoveY, Piece[][] board) {
        if(newMoveX == x || newMoveY == y){
            return false;
        }
        Piece piece = board[x][y];

        if((newMoveX <= 2 || newMoveX >= 7) && (newMoveY >= 3 && newMoveY <= 5)){
            if((newMoveX == x + 1 || newMoveX == x - 1) && (newMoveY == y + 1 || newMoveY == y - 1)){
                if(board[newMoveX][newMoveY] != null && board[newMoveX][newMoveY].getColor().equalsIgnoreCase(piece.getColor())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }
    
        @Override
    public String toString() {
        return (color.equals("Do") ? "M" : "m");
    }
    
}
