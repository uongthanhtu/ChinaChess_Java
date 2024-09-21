/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.player;

import src.board.ChessBoard;

/**
 *
 * @author Tusry
 */
public class Player {
    private String name;
    private String color;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void makeMove(ChessBoard board, int startX, int startY, int endX, int endY) {
        board.movePiece(startX, startY, endX, endY);
    }    
    
    
}
