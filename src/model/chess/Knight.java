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
        return true;
    }

    
        @Override
    public String toString() {
        return (color.equals("Do") ? "K" : "k");
    }
    
}
