/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.TDAs;

/**
 *
 * @author Miguel
 */
public class Paper extends Choice{

    public Paper(String name) {
        super(name);
        super.strongAt.add("Rock");
        super.weakAt.add("Sissors");
    }
    
}
