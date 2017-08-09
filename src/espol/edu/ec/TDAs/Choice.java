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
public class Choice implements Comparable<Choice>{
    private String option;
    
    public Choice(String option){
        this.option = option;
    }
    
    @Override
    public int compareTo(Choice c2){
        switch (option){
            case "rock":
                if (c2.option.equals("paper"))
                    return -1;
                else if (c2.option.equals("scissors"))
                    return 1;
                return 0;
            case "paper":
                if (c2.option.equals("rock"))
                    return 1;
                else if (c2.option.equals("scissors"))
                    return -1;
                return 0;
            case "scissors":
                if (c2.option.equals("rock"))
                    return -1;
                else if (c2.option.equals("paper"))
                    return 1;
                return 0;
            default:
                return 0;
        }
    }
}
