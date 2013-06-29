/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srpg;

/**
 *
 * @author sam
 */
public class Character {
    
    private String name;
    
    // Blank constructor.
    public Character(){
        this.name = "Anonymous";
    }
    
    public Character(String name){
        this.name = name;
    }
    
    // Clone a character.
    public Character(Character c){
        
    }
    
    public String getName(){
        return name;
    }
    
}
