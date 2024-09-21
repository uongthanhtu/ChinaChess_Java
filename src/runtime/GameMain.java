/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runtime;

import java.util.Scanner;
import src.board.ChessBoard;
import src.chess.Piece;
import src.player.Player;

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
                piece = board.getPiece(row, col);
                if (piece.isValidMove(newRow, newCol, board.getBoard())) {
                board.movePiece(row, col, newRow, newCol);
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }catch(Exception e){
                System.out.println("Error move!!!!!!");
            }
            
        }
        
    }
    
}
