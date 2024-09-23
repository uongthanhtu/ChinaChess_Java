/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.chess;

import javax.print.attribute.HashDocAttributeSet;

/**
 *
 * @author Tusry
 */
public class King extends Piece{

    public King( String color, int x, int y) {
        super("Tuong", color, x, y);
    }
    
    @Override
    public boolean isValidMove(int newMoveX, int newMoveY, Piece[][] board) {
        if(newMoveX == x && newMoveY == y){
            return false;
        }
        if(newMoveX != x && newMoveY != y){
            return false;
        }
        Piece piece = board[x][y];
        if(piece.getColor().equalsIgnoreCase("Den")){
            if(newMoveX != x){
                if( (newMoveX == x + 1 || newMoveX == x - 1) && ( newMoveX >= 0 && newMoveX <= 2)){
                    if( board[newMoveX][y] != null && board[newMoveX][y].getColor().equalsIgnoreCase("Den")){
                        return false;
                    }
                    return true;
                }
                return false;
            }

            if(newMoveY != y){
                if((newMoveY == y + 1 || newMoveY == y - 1) && ( newMoveY >= 3 && newMoveY <= 5)){
                    if(board[x][newMoveY] != null && board[x][newMoveY].getColor().equalsIgnoreCase("Den")){
                        return false;
                    }
                    return true;
                }
                return false;
            }

        }
        
        if(piece.getColor().equalsIgnoreCase("Do")){
            if(newMoveX != x){
                if((newMoveX == x + 1 || newMoveX == x - 1) && ( newMoveX >= 7 && newMoveX <= 9)){
                    if(board[newMoveX][y] != null && board[newMoveX][y].getColor().equalsIgnoreCase("Do")){
                        return false;
                    }
                    return true;
                }
                return false;
            }
            if(newMoveY != y){
                if((newMoveY == y + 1 || newMoveY == y - 1) && ( newMoveY >= 3 && newMoveY <= 5)){
                    if(board[x][newMoveY] != null && board[x][newMoveY].getColor().equalsIgnoreCase("Do")){
                        return false;
                    }
                    return true;
                }
                return false;
            }
        }
        return true;

    }

    @Override
    public void move(int newMoveX, int newMoveY, Piece[][] board) {
        super.move(newMoveX, newMoveY, board);
    }

    @Override
    public String toString() {
        return (color.equals("Do") ? "G" : "g");
    }
    
}
