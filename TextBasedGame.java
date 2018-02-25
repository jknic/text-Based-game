/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedgame;

import java.util.Scanner;

/**
 *
 * @author jknic
 */
public class TextBasedGame {
public static void main(String[] args) {
	Scanner kbR = new Scanner(System.in);
        TextBasedGame calling = new TextBasedGame();
  	
      //classes
      Heal healclass = new Heal();
      Enemy enemyclass = new Enemy();
      Weapons weaponsClass = new Weapons();
      Inventory inventoryClass = new Inventory();
      Armour armourClass = new Armour();
      
      int kill, gsTear, hTear, dTear, armourTear, kCounter;
      double    health, weaponElementDamage, damage, sheild, level, experince, armourDeffense;
      //the starting health for the enemy ;
       health = 100.00;
      //will stay the same ;
       damage = 1.00;
      //can be upgraded;
       sheild = 100.00;
      //can be upgraded;
       level = 0.00;
      //will go up over time;
       experince = 0.00;
      //when a enemy is killed you get some;
       armourDeffense =  1.00;
      //will use xp to buy and upgraded;
      kill = 0;
      //keeps your number of kills
      kCounter = 0;
      //Keeps count of kills for level
      
      //names of everthing;
      String weapon = "Hands";
      //What the weapon is;
      String armour = "Cloth";
      //What the armour is
      
      //Tears of the weapons
      gsTear = 0;//Great Sword
      hTear = 0;//Hammer
      dTear = 0;//Dagers
      armourTear = 0;//Armour
     

      //if store is typed then open it up // this will be a method
      //if inventory is typed open it up // this will be a class
      
      do {
        System.out.println("\n\n\n\n");
      	System.out.println("Please Say What you Would like to do: ");
        System.out.println("What You Can Do: ");
        System.out.println("Type \"Store\" To Open the Store");
        System.out.println("Type \"Inventory\" To Open the Inventory");
        System.out.println("Type \"Armour\" To See What Your Armour Is");
        System.out.println("Type \"Weapon\" To See What Your Weapon Is");
        System.out.println("Type \"Fight\" To Start the Fight");
        System.out.println("Type \"Experince\" To See How Much Experince You Have");
        System.out.print("Enter Here: ");
        
      	String inPut = kbR.nextLine();
        System.out.println("\n");
      	if(inPut.equals("Store"))
      	{
            String whatStore;
            int wrongStore = 0;
            
      		whatStore = calling.storeMain();
                do{
                
                    if("Weapon".equals(whatStore))
                    {//Will go to Weapon Class, and Store Method
                        String weaponChoose, upgrade, keepGoing;
                        int loop;
                        loop = 0;
                        System.out.println("\n\n\n\n");
                        System.out.println("What Weapon would You Like to upgrade?");
                        System.out.print("Great Sword, Hammer, Dagers, Or Exit: ");
                        weaponChoose = kbR.nextLine();
                        
                       while(loop == 0)
                        {
                            System.out.println("\n\n\n\n");
                            if(weapon.equals("Great Sword"))//Great Sword Store
                            {
                                System.out.println("To Upgrade Type Yes, To Cancel Type No");
                                System.out.println("The Tears cost is \n1st = 5 \n2nd = 25\n3rd = 50 \n4th = 75 \n5th = 100");
                                System.out.println("Your Experince is: " + experince + "\nYour Tear For the Great Sword is: " + gsTear);
                                upgrade = kbR.nextLine();
                                if(gsTear == 0 && experince >= 5 && upgrade.equals("Yes"))
                                        {
                                            gsTear++;
                                            experince = experince - 5; 
                                             damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(gsTear == 1 && experince >= 25 && upgrade.equals("Yes"))
                                        {
                                            gsTear++;
                                            experince = experince - 25;
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(gsTear == 2 && experince >= 50 && upgrade.equals("Yes"))
                                        {
                                            gsTear++;
                                            experince = experince - 50;
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(gsTear == 3 && experince >= 75 && upgrade.equals("Yes"))
                                        {
                                            gsTear++;
                                            experince = experince - 75; 
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(gsTear == 4 && experince >= 100 && upgrade.equals("Yes"))
                                        {
                                            gsTear++;
                                            experince = experince - 100; 
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if (gsTear == 5)
                                        {
                                            System.out.println("Your Great Sword is Max Level");
                                        }
                                else if(upgrade.equals("No"))
                                        {
                                            System.out.println("\n\n\n\n");
                                            System.out.println("Please Say What You Would Like To Do: ");
                                            System.out.print("Great Sword, Hammer, Dagers, Or Exit: ");
                                            weapon = kbR.nextLine();
                                            if(weapon.equals("Exit"))
                                                loop++;
                                        }
                                else
                                        {
                                            System.out.println("Please Check Your Points and Spelling");
                                        }
                                if(loop==0)
                                {
                                    System.out.println("Whould You Like to Keep UpGrading?");
                                    keepGoing = kbR.nextLine();
                                    if(keepGoing.equals("Yes"))
                                    {
                                        System.out.print("Pleae Say Which One Great Sword, Hammer, Dagers, Or Exit: ");
                                        weapon = kbR.nextLine();
                                    }
                                    else if(keepGoing.equals("No"))
                                    loop++;
                                    else
                                    {
                                    System.out.println("Please Re-Enter Yes Or No");
                                    keepGoing = kbR.nextLine();
                                    }
                                }
                            }
                            else if(weapon.equals("Hammer"))//Hammer Store
                            {
                                System.out.println("To Upgrade Type Yes, To Cancel Type No");
                                System.out.println("The Tears cost is \n1st = 15 \n2nd = 30\n3rd = 60 \n4th = 85 \n5th = 125");
                                System.out.println("Your Experince is: " + experince + "\nYour Tear For the Hammer is: " + hTear);
                                upgrade = kbR.nextLine();
                                if(hTear == 0 && experince >= 15 && upgrade.equals("Yes"))
                                        {
                                            hTear++;
                                            experince = experince - 15; 
                                             damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(hTear == 1 && experince >= 30 && upgrade.equals("Yes"))
                                        {
                                            hTear++;
                                            experince = experince - 30;
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(hTear == 2 && experince >= 60 && upgrade.equals("Yes"))
                                        {
                                            hTear++;
                                            experince = experince - 60;
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(hTear == 3 && experince >= 85 && upgrade.equals("Yes"))
                                        {
                                            hTear++;
                                            experince = experince - 85; 
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(hTear == 4 && experince >= 125 && upgrade.equals("Yes"))
                                        {
                                            hTear++;
                                            experince = experince - 125; 
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if (hTear == 5)
                                        {
                                            System.out.println("Your Hammer is Max Level");
                                        }
                                else if(upgrade.equals("No"))
                                        {
                                            System.out.println("\n\n\n\n");
                                            System.out.println("Please Say What You Would Like To Do: ");
                                            System.out.print("Great Sword, Hammer, Dagers, Or Exit: ");
                                            weapon = kbR.nextLine();
                                            if(weapon.equals("Exit"))
                                                loop++;
                                        }
                                else
                                        {
                                            System.out.println("Please Check Your Points and Spelling");
                                        }
                                if(loop==0)
                                {
                                    System.out.println("Whould You Like to Keep UpGrading?");
                                    keepGoing = kbR.nextLine();
                                    if(keepGoing.equals("Yes"))
                                    {
                                        System.out.print("Pleae Say Which One Great Sword, Hammer, Dagers, Or Exit: ");
                                        weapon = kbR.nextLine();
                                    }
                                    else if(keepGoing.equals("No"))
                                    loop++;
                                    else
                                    {
                                    System.out.println("Please Re-Enter Yes Or No");
                                    keepGoing = kbR.nextLine();
                                    }
                                }
                            }
                            else if(weapon.equals("Dagers"))
                            {
                                System.out.println("To Upgrade Type Yes, To Cancel Type No");
                                System.out.println("The Tears cost is \n1st = 25 \n2nd = 40\n3rd = 75 \n4th = 100 \n5th = 150");
                                System.out.println("Your Experince is: " + experince + "\nYour Tear For the Dagers are: " + dTear);
                                upgrade = kbR.nextLine();
                                if(dTear == 0 && experince >= 25 && upgrade.equals("Yes"))
                                        {
                                            dTear++;
                                            experince = experince - 25; 
                                             damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(dTear == 1 && experince >= 40 && upgrade.equals("Yes"))
                                        {
                                            dTear++;
                                            experince = experince - 40;
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(dTear == 2 && experince >= 75 && upgrade.equals("Yes"))
                                        {
                                            dTear++;
                                            experince = experince - 75;
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(dTear == 3 && experince >= 100 && upgrade.equals("Yes"))
                                        {
                                            dTear++;
                                            experince = experince - 100; 
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if(dTear == 4 && experince >= 150 && upgrade.equals("Yes"))
                                        {
                                            dTear++;
                                            experince = experince - 150; 
                                              damage = Weapons.TearTracker(gsTear, hTear, dTear, weapon);
                                        }
                                else if (dTear == 5)
                                        {
                                            System.out.println("Your Dagers are Max Level");
                                        }
                                else if(upgrade.equals("No"))
                                        {
                                            System.out.println("\n\n\n\n");
                                            System.out.println("Please Say What You Would Like To Do: ");
                                            System.out.print("Great Sword, Hammer, Dagers, Or Exit: ");
                                            weapon = kbR.nextLine();
                                            if(weapon.equals("Exit"))
                                                loop++;
                                        }
                                else
                                        {
                                            System.out.println("Please Check Your Points and Spelling");
                                        } 
                                if(loop==0)
                                {
                                    System.out.println("\n\n\n\n");
                                    System.out.println("Whould You Like to Keep UpGrading?");
                                    keepGoing = kbR.nextLine();
                                    if(keepGoing.equals("Yes"))
                                    {
                                        System.out.print("Pleae Say Which One Great Sword, Hammer, Dagers, Or Exit: ");
                                        weapon = kbR.nextLine();
                                    }
                                    else if(keepGoing.equals("No"))
                                    loop++;
                                    else
                                    {
                                    System.out.println("Please Re-Enter Yes Or No");
                                    keepGoing = kbR.nextLine();
                                    }
                                }
                            }
                            else if(weapon.equals("Exit"))
                                 loop++;
                             else 
                             {
                                 System.out.println("Please Re-Enter What Weapon that Was or Type Exit");
                                 weapon = kbR.nextLine();

                             }

                            wrongStore++;
                        }
                    }
                    else if("Armour".equals(whatStore))//need to do like one of the weapon classes
                    {
                                String  upgrade,keepGoing ;
                                int loop;
                                loop = 0;
                                while(loop == 0)
                                {
                                    System.out.println("\n\n\n\n");
                                    System.out.println("To Upgrade Type Yes, To Cancel Type No");
                                    System.out.println("The Tears cost is \n1st = 25 \n2nd = 75\n3rd = 150 \n4th = 300 \n5th = 500");//Need to Fix
                                    System.out.println("Your Experince is: " + experince + "\nYour Tear For Armour is: " + armourTear);
                                    upgrade = kbR.nextLine();
                                    if(armourTear == 0 && experince >= 25 && upgrade.equals("Yes"))
                                            {
                                                armour = "Leather";
                                                armourTear++;
                                                experince = experince - 25; 
                                                 loop++;
                                                 armourDeffense = Armour.Armour(armourTear);
                                            }
                                    else if(armourTear == 1 && experince >= 75 && upgrade.equals("Yes"))
                                            {
                                                armour = "Chain";
                                                armourTear++;
                                                experince = experince - 75;
                                                 loop++;
                                                  armourDeffense = Armour.Armour(armourTear);
                                            }
                                    else if(armourTear == 2 && experince >= 150 && upgrade.equals("Yes"))
                                            {
                                                armour = "Iron";
                                                armourTear++;
                                                experince = experince - 150;
                                                 loop++;
                                                  armourDeffense = Armour.Armour(armourTear);
                                            }
                                    else if(armourTear == 3 && experince >= 300 && upgrade.equals("Yes"))
                                            {
                                                armour = "Gold";
                                                armourTear++;
                                                experince = experince - 300; 
                                                 loop++;
                                                 armourDeffense = Armour.Armour(armourTear);                                            }
                                    else if(armourTear == 4 && experince >= 500 && upgrade.equals("Yes"))
                                            {
                                                armour = "Obsidian";
                                                armourTear++;
                                                experince = experince - 500; 
                                                 loop++;
                                                  armourDeffense = Armour.Armour(armourTear);
                                            }
                                    else if (armourTear == 5)
                                            {
                                                System.out.println("Your Armour is Max Level");
                                                 loop++;
                                            }
                                    else if(upgrade.equals("No"))
                                        {
                                            System.out.println("\n\n\n\n");
                                            System.out.println("Please Say What You Would Like To Do: ");
                                            System.out.print("Great Sword, Hammer, Dagers, Or Exit: ");
                                            weapon = kbR.nextLine();
                                            if(weapon.equals("Exit"))
                                                loop++;
                                        }
                                    else
                                            {
                                                System.out.println("Please Check Your Points and Spelling");
                                            }
                                    if(loop==0)
                                            {
                                                System.out.println("\n\n\n\n");
                                                System.out.println("Whould You Like to Keep UpGrading?");
                                                keepGoing = kbR.nextLine();
                                                if(keepGoing.equals("Yes"))
                                                {
                                                    System.out.print("Pleae Say Which One Great Sword, Hammer, Dagers, Or Exit: ");
                                                    weapon = kbR.nextLine();
                                                }
                                                else if(keepGoing.equals("No"))
                                                loop++;
                                                else
                                                {
                                                System.out.println("Please Re-Enter Yes Or No");
                                                keepGoing = kbR.nextLine();
                                                }
                                            }
                                }
                        wrongStore++;
                    }
                    else if("Exit".equals(whatStore))
                    {
                        wrongStore++;
                    }
                    else
                    {
                        System.out.println("Please Re-Enter What You Would Like To Open");
                     whatStore = calling.storeMain();
                    }
                 
           }while(wrongStore == 0);
        }
      	
                                                                                    if(inPut.equals("Inventory"))
                                                                                   {//will send out what tear of armour and weapons but will not need to get any info back
                                                                                       String whatWeapon;
                                                                                       Inventory.Weapons(gsTear, hTear, dTear, damage);
                                                                                       
                                                                                        System.out.println("This is what Armour you have: " + armour + "Your Defense is " + armourDeffense);
                                                                                        
                                                                                        System.out.print("If You Would Like To Set Your Weapon Please Say What Weapon");
                                                                                        whatWeapon = kbR.nextLine();
                                                                                        damage = Inventory.setWeapon(whatWeapon, gsTear, hTear, dTear);
                                                                                        weapon = whatWeapon;
                                                                                   }
 if(inPut.equals("Armour"))
 {
          System.out.println("This is what Armour you have: " + armour + "Your Defense is " + armourDeffense);
 }
if(inPut.equals("Weapon"))
{
          System.out.println("This is what Weapon you have: " + weapon + damage);
}
                                                                                    if(inPut.equals("Fight"))
                                                                                   {//This will Start the fight
                                                                                       
                                                                                        int eNum, eaction;
                                                                                        double eHealth,eDamage, dtaken, heal, eExperince,loopHealth;
                                                                                        String action, eAction;
                                                                                        
                                                                                        loopHealth = health;
                                                                                        eDamage = Enemy.dps( level);
                                                                                        eHealth = Enemy.health( level);
                                                                                        eNum = Enemy.numberEnemy(level);
                                                                                        
                                                                                        eExperince = Enemy.eExperince( level);

                                                                                        while((health > 0 && eHealth > 0) || eNum != 0)
                                                                                        {
                                                                                            System.out.println("\n\n\n\n");
                                                                                            System.out.println("You can Hit or Block or Heal");
                                                                                            System.out.println("Each Heal Cost 10 Experince: "+ experince);
                                                                                            System.out.println("Your Health: " + health);
                                                                                            System.out.println("Enemy Health: " + eHealth);
                                                                                            System.out.print("What would you like to do? ");
                                                                                            action = kbR.nextLine();
                                                                                            while(!action.equals("Block") && !action.equals("Hit") && !action.equals("Heal"))
                                                                                            {
                                                                                                System.out.print("Please Re-enter what you want to do: " ); 
                                                                                                action = kbR.nextLine();

                                                                                            }
                                                                                            System.out.println("You picked " + action);

                                                                                            eaction =(int) (Math.random() * 5+1);

                                                                                            if(eaction == 1 || eaction == 2 ||eaction == 3 || eaction == 4)
                                                                                                eAction = "Hit";
                                                                                            else
                                                                                                eAction = "Block";

                                                                                            System.out.println("Enemy picked " + eAction);

                                                                                            if((eaction == 1 || eaction == 2 ||eaction == 3 || eaction == 4 )&& action.equals("Hit"))
                                                                                            {
                                                                                                if(armourTear < 3) 
                                                                                                    dtaken =2 * (eDamage/armourDeffense);
                                                                                                else
                                                                                                    dtaken =(eDamage/armourDeffense);
                                                                                                System.out.println("Enemy Hit you for: " + dtaken);
                                                                                                health -= dtaken;
                                                                                                System.out.println("You Hit you for: " + damage);
                                                                                                eHealth -= damage;
                                                                                            }
                                                                                            else if((eaction == 1 || eaction == 2 ||eaction == 3 || eaction == 4) && action.equals("Block"))
                                                                                            { 
                                                                                                System.out.println("You Blocked the hit" );
                                                                                            }
                                                                                            else if(eaction == 4&& action.equals("Block"))
                                                                                            { 
                                                                                                System.out.println("You Both Blocked" );
                                                                                            }
                                                                                            else if(eaction == 4&& action.equals("Hit"))
                                                                                            { 
                                                                                                System.out.println("The enemy Blocked your hit" );
                                                                                            }
                                                                                            
                                                                                            else if((eaction == 1 || eaction == 2 ||eaction == 3 || eaction == 4 )&& action.equals("Heal"))
                                                                                            {
                                                                                                if(experince >= 10)
                                                                                                {  
                                                                                                experince = Heal.experince(experince);
                                                                                                dtaken = 2 * (eDamage/armourDeffense);
                                                                                                System.out.println("Enemy Hit you for: " + dtaken);
                                                                                                health -= dtaken;
                                                                                                heal = 100 - health;
                                                                                                System.out.println("But You Healed: " + heal);
                                                                                                }
                                                                                                else 
                                                                                                        System.out.println("You can not Heal Sorry");
                                                                                            }
                                                                                            if(eHealth <= 0 )
                                                                                            {
                                                                                                eNum--;
                                                                                                kill++;
                                                                                                kCounter++;
                                                                                                experince += eExperince;
                                                                                            }
                                                                                             if(health <= 0)
                                                                                            {
                                                                                                eNum = 0;
                                                                                                eHealth = 0;
                                                                                                loopHealth = 0;
                                                                                            }

                                                                                        }

                                                                                       System.out.println("You got a Kill");
                                                                                   }
                                                                                    if(inPut.equals("Kill"))
                                                                                   {
                                                                                       health = 0;
                                                                                   }//need to Delete this it is only for Testing
                                                                                    if("Experince".equals(inPut))
                                                                                    {
                                                                                    System.out.println("Your Experince: " + experince);
                                                                                    System.out.println("Your Level: " + level );
                                                                                    }
       while(kCounter == 5)
       {
       level++;
       kCounter -= 5;
       
       }
         
      	
      }while( health > 0);
      
      System.out.println("You Lost\nBetter Luck Next Time");
      System.out.println("Your LvL: "+ level);
      System.out.println("Kills: " + kill);
     }
      
    
        public String storeMain()
       {
            Scanner kbR = new Scanner(System.in);
            String whatStore;
            System.out.print("What Store Would You Like to Open? ");
            System.out.println("Weapon Shop");
            System.out.println("Armour Shop");
            System.out.print("Or Exit: ");
            whatStore = kbR.nextLine();

            return whatStore;
        }

}
