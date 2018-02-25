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
public class Enemy {
 public static double health(double level)
    {
        double eHealth;
        eHealth = 0;
        
        if(level >= 75)
        {
         eHealth = 300;
        }
        else if(level >= 50)
        {
        eHealth = 200;
        }
        else if(level >= 25)
        {
        eHealth = 100;
        }
        else if(level >= 10)
        {
            eHealth = 50;
        }
        else if(level >= 5)
        {
        eHealth = 25;
        }
        else
        {
        eHealth = 5;
        }
        
        
        return eHealth;
    }
    public static double dps(double level)
    {
        double dps;
        dps = 0;
        
        if(level >= 75)
        {
            dps = 200;
        }
        else if(level >= 50)
        {
                    dps = 100;

        }
        else if(level >= 25)
        {
                    dps = 50;

        }
        else if(level >= 10)
        {
                    dps = 20;

        }
        else if(level >= 5)
        {
                    dps = 10;

        }
        else
        {
        
                    dps = 1;

        }
        
        
        return dps;
    }
     public static int numberEnemy(double level)
    {
        int number;
        number = 0;
        
        if(level >= 90)
        {
            number = 5;
        }
        else if(level >= 70)
        {
             number = 4;
 
        }
        else if(level >= 50)
        {
            number = 3;

        }
        else if(level >= 30)
        {           
            number = 2;
        }
        else if(level >= 15)
        {
            number = 1;

        }
        else
        {
             number = 1;

        
        }
        
        
        return number;
    }
            public static double eExperince(double level)
    {
        double experince;
        experince = 0;
        
        if(level >= 75)
        {
            experince = 50;
        }
        else if(level >= 50)
        {
            experince = 35;
        }
        else if(level >= 25)
        {
            experince = 25;
        }
        else if(level >= 10)
        {
            experince = 15;
        }
        else if(level >= 5)
        {
            experince = 5;
        }
        else
        {
        
            experince = 1;
        }
        
        return experince;
    }
    
}
