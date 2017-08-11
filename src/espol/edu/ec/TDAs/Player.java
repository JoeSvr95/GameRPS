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
    private String name;
    private Choice choice;
    private int wins;
    
    public Player(String name){
        this.name = name;
    }
    
    public Choice getChoice(){
        int c = (int)(Math.random()*3);
        switch (c){
            case 0:
                choice = new Rock("Rock");
                break;
            case 1:
                choice = new Paper("Paper");
                break;
            case 2:
                choice = new Sissors("Sissors");
                break;
        }
        return choice;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.name + "\nGanados: " + this.wins + "\n";
    }
    
    public void addWin(){
        this.wins++;
    }
    
    public int getWins(){
        return this.wins;
    }
}
