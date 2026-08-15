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
        Scanner input = new Scanner(System.in);
        char play = 'Y';
        while (play == 'Y') {
            board = new Board(o, x);
            for (int i = 1; i < 10; i++) {
                showBoard();
                showTurn();
                inputRowCol();
                if (board.checkWin()) {
                    showBoard();
                    printWin();
                    break;
                }
                board.switchPlayer();
            }
            printDraw();
            board.updateScore();
            printScore();
            System.out.print("Play again(Y/N): ");
            play = input.next().charAt(0);
        }
    }

    public void showWelcome() {
        System.out.println("Welcome to OX Game");
    }

    public void showBoard() {
        char[][] table = board.getTable();
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table.length; col++) {
                System.out.print(table[row][col]);
            }
            System.out.println();
        }
    }

    public void showTurn() {
        System.out.println("Turn " + board.getCurrentPlayer().getName());
    }

    public void inputRowCol() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please input row, col: ");
            int row = input.nextInt();
            int col = input.nextInt();
            if (board.checkRowCol(row, col)) {
                board.setRowCol(row, col);
                break;
            } else {
                System.out.println("ERROR");
            }
        }
    }

    public void printWin() {
        System.out.println(board.getCurrentPlayer().getName() + " Win!");
    }

    public void printDraw() {
        if (!board.checkWin()) {
            System.out.println("DRAW!");
        }
    }

    public void printScore() {
        System.out.println(o.toString());
        System.out.println(x.toString());
    }
}
