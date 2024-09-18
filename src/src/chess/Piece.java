/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.chess;

/**
 *
 * @author ADMIN
 */
public abstract class Piece {
    protected String name;
    protected String color;
    protected int x;
    protected int y;

    public Piece(String name, String color, int x, int y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    
    public abstract boolean isValidMove(int newMoveX, int newMoveY, Piece[][] board);
    
    public void move(int newMoveX, int newMoveY, Piece[][] board){
            this.x = newMoveX;
            this.y = newMoveY;
    }

    @Override
    public String toString() {
        return name +color ;
    }
}
