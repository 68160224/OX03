/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop.oxgame03;

/**
 *
 * @author Windows
 */

import java.util.*;

public class Game {
    private Board board;
    private Player x;
    private Player o;
    
    public Game() {
        o = new Player('o');
        x = new Player('x');
        showWelcome();
    }
    
    public void play() {
        board = new Board(o, x);
        for (int i = 1; i < 10; i++) {
            showBoard();
            showTurn();
            inputRowCol();
            printWin();
        }
    }
    private void showWelcome() {
        System.out.println("Welcome to OX Game");
    }
    
    private void showBoard() {
        char[][] table = board.getTable();
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table.length; col++) {
                System.out.print(table[row][col]);
            }
            System.out.println();
        }
    }
    
    private void showTurn() {
        System.out.println("Turn " + board.getCurrentPlayer().getName());
    }
    
    private void inputRowCol() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input row, col: ");
        int row = input.nextInt();
        int col = input.nextInt();
        board.setRowCol(row, col);
        board.switchPlayer();
    }
    
    private void printWin() {
        if (board.checkWin()) {
            System.out.println(board.getCurrentPlayer() + " Win!");
        }
    }
}
