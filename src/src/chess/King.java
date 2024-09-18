/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.chess;

/**
 *
 * @author ADMIN
 */
public class King extends Piece{

    public King( String color, int x, int y) {
        super("Tuong", color, x, y);
    }
    
    @Override
    public boolean isValidMove(int newMoveX, int newMoveY, Piece[][] board) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        @Override
    public String toString() {
        return (color.equals("Do") ? "G" : "g");
    }
    
}
