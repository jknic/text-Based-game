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
public class Weapons {
    public static double TearTracker(int gsTear, int hTear, int dTear, String weapon)
    {
        double damage = 0;
        Weapons calling = new Weapons();
        if(weapon.equals("Great Sword"))
        {
        int tear = gsTear;
        damage = calling.GreatSword(tear);
        }
        if(weapon.equals("Hammer"))
        {
        int tear = hTear;
        damage = calling.Hammer(tear);
        }
        if(weapon.equals("Dagers"))
        {
        int tear = dTear;
        damage = calling.Dagers(tear);
        }
        return damage;
    }
    public static double GreatSword(int tear)
    {
     
        double damage;
        if(tear == 5)
        {
            damage = 100;
        }
        else if(tear == 4)
        {
            damage = 75;
        }
         else if(tear == 3)
        {
            damage = 50;
        }
         else if(tear == 2)
        {
            damage = 25;
        }
         else 
        {
            damage = 10;
        }
    
        return damage;
    }
    public static double Hammer(int tear)
    {
        double damage;
         if(tear == 5)
        {
            damage = 125;
        }
        else if(tear == 4)
        {
            damage = 85;
        }
         else if(tear == 3)
        {
            damage = 60;
        }
         else if(tear == 2)
        {
            damage = 30;
        }
         else
        {
            damage = 15;
        }
        return damage;
    
    }
    public static double Dagers(int tear)
    {
        double damage;
        if(tear == 5)
        {
            damage = 150;
        }
        else if(tear == 4)
        {
            damage = 100;
        }
         else if(tear == 3)
        {
            damage = 75;
        }
         else if(tear == 2)
        {
            damage = 40;
        }
         else 
        {
            damage = 25;
        }
        
    
        return damage;
    }
}
