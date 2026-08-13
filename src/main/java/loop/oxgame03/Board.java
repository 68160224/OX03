/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop.oxgame03;

/**
 *
 * @author Windows
 */
public class Board {
    private char[][] table = {{'-', '-', '-'},
    {'-', '-', '-'},
    {'-', '-', '-'}};
    private Player currentPlayer;
    private Player o, x;
    
    public Board(Player o, Player x) {
        this.o = o;
        this.x = x;
        this.currentPlayer = o;
    }
    
    public char[][] getTable() {
        return table;
    }

    public void setRowCol(int row, int col) {
        this.table[row - 1][col - 1] = currentPlayer.getName();
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    
    public void switchPlayer() {
        if (this.currentPlayer == o) {
            this.currentPlayer = x;
        } else {
            this.currentPlayer = o;
        }
    }
}
