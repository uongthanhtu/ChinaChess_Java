/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.chess;

/**
 *
 * @author Tusry
 */
public class Knight extends Piece{

    public Knight(String color, int x, int y) {
        super("Ma", color, x, y);
    }

    @Override
    public boolean isValidMove(int newMoveX, int newMoveY, Piece[][] board) {
        if(newMoveX == x || newMoveY == y){
            return false;
        }
        Piece piece = board[newMoveX][newMoveY];
        if(((newMoveX == x + 2 || newMoveX == x - 2) && (newMoveY == y + 1 || newMoveY == y - 1 ))){
            if(newMoveX == x + 2){
                if (board[x + 1][y] == null) {
                    if(piece != null && piece.getColor().equalsIgnoreCase(board[x][y].getColor())){
                        return false;
                    }
                    return true;
                }
                return false;
            }
            if (board[x - 1][y] == null) {
                if(piece != null && piece.getColor().equalsIgnoreCase(board[x][y].getColor())){
                    return false;
                }
                return true;
            }
            return false;
        }
        if((newMoveX == x + 1 || newMoveX == x - 1) && (newMoveY == y + 2 || newMoveY == y - 2 )){
            if(newMoveY == y + 2){
                if (board[x][y + 1] == null) {
                    if(piece != null && piece.getColor().equalsIgnoreCase(board[x][y].getColor())){
                        return false;
                    }
                    return true;
                }
                return false;
            }
            if (board[x][y - 1] == null) {
                if(piece != null && piece.getColor().equalsIgnoreCase(board[x][y].getColor())){
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
        return (color.equals("Do") ? "K" : "k");
    }
    
}
