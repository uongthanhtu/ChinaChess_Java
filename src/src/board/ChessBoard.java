/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.board;

import src.chess.Cannon;
import src.chess.Elephant;
import src.chess.King;
import src.chess.Knight;
import src.chess.Minister;
import src.chess.Pawn;
import src.chess.Piece;
import src.chess.Rook;

/**
 *
 * @author ADMIN
 */
public class ChessBoard  {
    private static Piece[][] board = new Piece[10][9];
//-----------------------------------------
//|    車   馬   象   士   將   士   象   馬  車
//|    X   X   X   X   X   X   X   X   X   X
//|    X   砲   X   X   X   X   X   X  砲   X
//|    卒   X   卒   X   卒   X   卒   X   X   X
//|    X   X   X   X   X   X   X   X   X   X
//|    X   X   X   X   X   X   X   X   X   X
//|    X   X   X   X   X   X   X   X   X   X
//|    X   X   X   X   X   X   X   X   X   X
//|    X   X   X   X   X   X   X   X   X   X
//|    X   X   X   X   X   X   X   X   X   X   
    public ChessBoard() {
        board[0][4] = new King("Den", 0, 4);
        board[0][0] = new Rook("Den", 0, 0);
        board[0][8] = new Rook("Den", 0, 8);
        board[0][1] = new Knight("Den", 0, 1);
        board[0][7] = new Knight("Den", 0, 7);
        board[0][2] = new Elephant("Den", 0, 2);
        board[0][6] = new Elephant("Den", 0, 6);
        board[0][3] = new Minister("Den", 0, 3);
        board[0][5] = new Minister("Den", 0, 5);
        board[2][1] = new Cannon("Den", 2, 1);
        board[2][7] = new Cannon("Den", 2, 7);
        board[3][0] = new Pawn("Den", 3, 0);
        board[3][2] = new Pawn("Den", 3, 2);
        board[3][4] = new Pawn("Den", 3, 4);
        board[3][6] = new Pawn("Den", 3, 6);
        board[3][8] = new Pawn("Den", 3, 8);
        //------------
        board[9][4] = new King("Do", 9, 4);
        board[9][0] = new Rook("Do", 9, 0);
        board[9][8] = new Rook("Do", 9, 8);
        board[9][1] = new Knight("Do", 9, 1);
        board[9][7] = new Knight("Do", 9, 7);
        board[9][2] = new Elephant("Do", 9, 2);
        board[9][6] = new Elephant("Do", 9, 6);
        board[9][3] = new Minister("Do", 9, 3);
        board[9][5] = new Minister("Do", 9, 5);
        board[7][1] = new Cannon("Do", 7, 1);
        board[7][7] = new Cannon("Do", 7, 7);
        board[6][0] = new Pawn("Do", 6, 0);
        board[6][2] = new Pawn("Do", 6, 2);
        board[6][4] = new Pawn("Do", 6, 4);
        board[6][6] = new Pawn("Do", 6, 6);
        board[6][8] = new Pawn("Do", 6, 8);
    }

    public static Piece[][] getBoard() {
        return board;
    }
    
    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public Class<? extends Piece> getTypePiece(int x, int y) {
        if(board[x][y] != null){
            return board[x][y].getClass();
        }
        return null;
    }
    
    public void movePiece(int startX, int startY, int endX, int endY) {
        Piece piece = board[startX][startY];
        if (piece != null && piece.isValidMove(endX, endY, board)) {
            board[endX][endY] = piece;
            board[startX][startY] = null;
            piece.move(endX, endY, board);
             
        } else {
            System.out.println("Move Error");
        }
    }
    
    public void printBoard(){
        System.out.println("x|------------------>y");
        System.out.print(" |  ");
        for (int i = 0; i < 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "|  ");
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == null){
                    System.out.print("* ");
                }else{
                    System.out.print(board[i][j]+ " ");
                }
            }
            System.out.println("");
        }
    }
    
    
    
}
