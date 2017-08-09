/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.main;

import espol.edu.ec.TDAs.Player;

/**
 *
 * @author HOME
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static final int MIN_WINS = 3;
    
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        boolean gameWon = false;
        int draws = 0;
        int roundsPlayed = 0;
        
        do{
            System.out.println("***** Round: " + (roundsPlayed + 1) + " *****\n");
            System.out.println("Number of Draws: " + draws + "\n");
            int resultado = p1.getChoice().compareTo(p2.getChoice());
            
            switch (resultado){
                case 1:
                    p1.addWin();
                    System.out.println("Player 1 wins");
                    break;
                case -1:
                    p2.addWin();
                    System.out.println("Player 2 wins");
                    break;
                case 0:
                    draws++;
                    System.out.println("Draw");
                    break;
            }
            roundsPlayed++;
            if (p1.getWins() >= MIN_WINS || p2.getWins() >= MIN_WINS){
                gameWon = true;
                System.out.println("GAME WON");
            }
        }while(!gameWon);
    }
    
}
