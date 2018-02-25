/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedgame;

/**
 *
 * @author jknic
 */
public class Armour {
    public static double Armour(int armourTear)
    {
        int tear = armourTear;
        double defense = 0;
     
        double damage;
        if(tear == 5)
        {
            defense = 500;
        }
        else if(tear == 4)
        {
            defense = 300;
        }
         else if(tear == 3)
        {
            defense = 150;
        }
         else if(tear == 2)
        {
            defense = 75;
        }
         else 
        {
            defense = 25;
        }
    
        return defense;
    }
    
}
