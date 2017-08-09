/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.TDAs;

/**
 *
 * @author HOME
 */
public class Player {
    private Choice choice;
    private int wins;
    
    public Choice getChoice(){
        int c = (int)(Math.random()*3);
        switch (c){
            case 0:
                choice = new Choice("rock");
                break;
            case 1:
                choice = new Choice("paper");
                break;
            case 2:
                choice = new Choice("scissors");
                break;
        }
        return choice;
    }
    
    public void addWin(){
        this.wins++;
    }
    
    public int getWins(){
        return this.wins;
    }
}
