/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.util.Scanner;
import model.board.ChessBoard;
import model.chess.Piece;
import model.player.Player;

/**
 *
 * @author Tusry
 */
public class GameMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        
        Player player1 = new Player("Player1", "Do");
        Player player2 = new Player("Player2", "Den");
        Scanner scanner = new Scanner(System.in);
        while(true){
            board.printBoard();
            System.out.println("Nhap vi tri quan ban muon di");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println("Nhap vi tri ban muon di toi");
            int newRow = scanner.nextInt();
            int newCol = scanner.nextInt();
            Piece piece;
            try{
                System.out.println(row +" " + col);
                piece = board.getPiece(row, col);
                System.out.println(piece);
                System.out.println(board.getPiece(newRow, newCol));
                if (piece.isValidMove(newRow, newCol, ChessBoard.getBoard())) {
                    System.out.println(board.getPiece(newRow, newCol));
                board.movePiece(row, col, newRow, newCol);
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }catch(Exception e){
                System.out.println(e);
                System.out.println("Error move!!!!!!");
            }
        }

    }
}
