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
public class Inventory {
    public static void Weapons(int gsTear, int hTear,int dTear, double damage )
    {
        //Great Sword
        if(gsTear == 0)
        {
            System.out.println("Your Great Sword is Tear" + gsTear + "And your Damgae is 0 ");
        }
        if(gsTear == 1)
        {
            System.out.println("Your Great Sword is Tear" + gsTear + "And your Damgae is 5 ");
        }
        if(gsTear == 2)
        {
            System.out.println("Your Great Sword is Tear" + gsTear + "And your Damgae is 25 ");
        }
        if(gsTear == 3)
        {
            System.out.println("Your Great Sword is Tear" + gsTear + "And your Damgae is 50 ");
        }
        if(gsTear == 4)
        {
            System.out.println("Your Great Sword is Tear" + gsTear + "And your Damgae is 75 ");
        }
        if(gsTear == 5)
        {
            System.out.println("Your Great Sword is Tear" + gsTear + "And your Damgae is 100 ");
        }
        
        
        
        
        //Hammer
        if(hTear == 0)
        {
            System.out.println("Your Hammer is Tear" + hTear + "And your Damgae is 0 ");
        }
        if(hTear == 1)
        {
            System.out.println("Your Hammer is Tear" + hTear + "And your Damgae is 15 ");
        }
        if(hTear == 2)
        {
            System.out.println("Your Hammer is Tear" + hTear + "And your Damgae is 30 ");
        }
        if(hTear == 3)
        {
            System.out.println("Your Hammer is Tear" + hTear + "And your Damgae is 60 ");
        }
        if(hTear == 4)
        {
            System.out.println("Your Hammer is Tear" + hTear + "And your Damgae is 85 ");
        }
        if(hTear == 5)
        {
            System.out.println("Your Hammer is Tear" + hTear + "And your Damgae is 125 ");
        }
        
        
        
        
        //Daggers
        if(dTear == 0)
        {
            System.out.println("Your Daggers is Tear" + dTear + "And your Damgae is 0 ");
        }
        if(dTear == 1)
        {
            System.out.println("Your Daggers is Tear" + dTear + "And your Damgae is 25 ");
        }
        if(dTear == 2)
        {
            System.out.println("Your Daggers is Tear" + dTear + "And your Damgae is 40 ");
        }
        if(dTear == 3)
        {
            System.out.println("Your Daggers is Tear" + dTear + "And your Damgae is 75 ");
        }
        if(dTear == 4)
        {
            System.out.println("Your Daggers is Tear" + dTear + "And your Damgae is 100 ");
        }
        if(dTear == 5)
        {
            System.out.println("Your Daggers is Tear" + dTear + "And your Damgae is 150 ");
        }
    }
    public static double setWeapon(String whatWeapon,int gsTear, int hTear,int dTear)
    {
        double damage;
        damage = 1;
    if(gsTear == 0)
        {
            damage = 1;
        }
        if(gsTear == 1)
        {
            damage = 5;
        }
        if(gsTear == 2)
        {
            damage = 25;
        }
        if(gsTear == 3)
        {
            damage = 50;
        }
        if(gsTear == 4)
        {
            damage = 75;
        }
        if(gsTear == 5)
        {
            damage = 100;
        }
        
        
        
        
        //Hammer
        if(hTear == 0)
        {
            damage = 1;
        }
        if(hTear == 1)
        {
            damage = 15;
        }
        if(hTear == 2)
        {
            damage = 30;
        }
        if(hTear == 3)
        {
            damage = 60;
        }
        if(hTear == 4)
        {
            damage = 85;
        }
        if(hTear == 5)
        {
            damage = 125;
        }
        
        
        
        
        //Daggers
        if(dTear == 0)
        {
            damage = 1;
        }
        if(dTear == 1)
        {
            damage = 25;
        }
        if(dTear == 2)
        {
            damage = 40;
        }
        if(dTear == 3)
        {
            damage = 75;
        }
        if(dTear == 4)
        {
            damage = 100;
        }
        if(dTear == 5)
        {
            damage = 150;
        }
    
    
    
    
    return damage;
    }
    
    
}
    

