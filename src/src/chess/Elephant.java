/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.chess;

/**
 *
 * @author Tusry
 */
public class Elephant extends Piece{

    public Elephant( String color, int x, int y) {
        super("Voi", color, x, y);
    }

    @Override
    public boolean isValidMove(int newMoveX, int newMoveY, Piece[][] board) {
        if(newMoveX == x || newMoveY == y){
            return false;
        }
        Piece piece = board[x][y];
        if((newMoveX == x + 2 || newMoveX == x - 2) && (newMoveY == y + 2 || newMoveY == y - 2)){
            if(newMoveY == 0 || newMoveY == 2 || newMoveY == 6 || newMoveY == 8 || newMoveY == 4){
                if(piece.getColor().equalsIgnoreCase("Den")){
                    if(newMoveX == 0 || newMoveX == 2 || newMoveX == 4){
                        if(board[newMoveX][newMoveY] != null && board[newMoveX][newMoveY].getColor().equalsIgnoreCase("Den")) {
                            return false;
                        }
                        int checkBlockX = (newMoveX + x) / 2;
                        int checkBlockY = (newMoveY + y) / 2;
                        if(board[checkBlockX][checkBlockY] != null){
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                if(piece.getColor().equalsIgnoreCase("Do")){
                    if(newMoveX == 5 || newMoveX == 7 || newMoveX == 9){
                        if(board[newMoveX][newMoveY] != null && board[newMoveX][newMoveY].getColor().equalsIgnoreCase("Do")) {
                            return false;
                        }
                        int checkBlockX = (newMoveX + x) / 2;
                        int checkBlockY = (newMoveY + y) / 2;
                        if(board[checkBlockX][checkBlockY] != null){
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return (color.equals("Do") ? "E" : "e");
    }
    
    
    
    
    
}
