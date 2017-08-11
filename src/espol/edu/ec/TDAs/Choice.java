/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.TDAs;

import java.util.ArrayList;

/**
 *
 * @author HOME
 */
public class Choice {
    protected String name;
    protected ArrayList<String> strongAt;
    protected ArrayList<String> weakAt;
    
    public Choice(String name){
        this.name = name;
        strongAt = new ArrayList<>();
        weakAt = new ArrayList<>();
    }
    
    public int compareTo(Choice c2) {
        if (strongAt.contains(c2.name))
            return 1;
        else if (weakAt.contains(c2.name))
            return -1;
        return 0;
    }
    
}
