/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop.oxgame03;

/**
 *
 * @author Windows
 */
public class Game {
    private Board board;
    private Player x;
    private Player o;
    
    public Game() {
        o = new Player('o');
        x = new Player('x');
        showWelcome();
    }
}
