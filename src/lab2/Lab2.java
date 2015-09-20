 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Bang
 */
public class Lab2 {

    private boolean on = false;
    private int waterLevel = 0;
    private int beansLevel = 0;
    private int dirtyLevel = 0;
    
    public void instruction(){
        System.out.println("Press 1 to turn power ON");
        System.out.println("Press 2 to fill water");
        System.out.println("Press 3 to fill beans");
        System.out.println("Press 4 to make Espresso");
        System.out.println("Press 5 to make coffee");
        System.out.println("Press 0 to show instruction");
       // System.out.println("Your command please: ");
        //System.out.println("\r");
        
    }
    public void pressPower(){
        if (on == false){
            on = true;
            System.out.println("You have turned ON the power!");
            System.out.println("Auto rinse");
            rinse();
        } else if (on == true){
            on = false;
            System.out.println("You have turned OFF the power!");
            System.out.println("Auto rinse");
            rinse();
        }
    }
    public void pressEspresso(){
        if (on==true && waterLevel>200 && beansLevel >50){
        waterLevel -= 30;
        beansLevel -= 8;
        dirtyLevel += 20;
        clean();
        System.out.println("Here is your Espresso!");
            
    } else if (on==false){
            System.out.println("Please turn ON the power");
    } else if (waterLevel<200){
            System.out.println("Please fill the water tank");
    } else if (beansLevel<100){
            System.out.println("Please fill the beans tank");
        }
    }
    public void pressRegular(){
        if (on==true && waterLevel>200 && beansLevel >50){
        waterLevel -= 150;
        beansLevel -= 10;
        dirtyLevel += 20;
        clean();
            System.out.println("Here is your Cofee!");
            
    } else if (on==false){
            System.out.println("Please turn ON the power");
    } else if (waterLevel<200){
            System.out.println("Please fill the water tank");
    } else if (beansLevel<100){
            System.out.println("Please fill the beans tank");
        }
    }
    public void fillWater(){
       if(on==true){
           waterLevel = 1000;
           System.out.println("Filled the water tank: "+waterLevel);
       } else {
           System.out.println("Please press 1 to turn power ON");
       }
    }
    public void fillBeans(){
        if (on==true){
        beansLevel = 100;
            System.out.println("Filled the beans tank: "+beansLevel);
    } else {
            System.out.println("Please press 1 to turn power ON");
        }
    }
    public void rinse(){
       if (on==true){
        waterLevel -= 25;
           
    } else {
            System.out.println("Please press 1 to turn power ON");
        } 
    }
    public void clean(){
        if (on==true&&dirtyLevel>=100){
        waterLevel -= 300;
        dirtyLevel =0;
            System.out.println("Auto cleaning, reducing water level 300");
    } else if(on==false) {
            System.out.println("Please press 1 to turn power ON");
        }
        
    }
    //public void checking(){
       
       // if(on==false){
         //       System.out.println("Press 1 to turn power ON");
      //     if (waterLevel <=300){
        //        System.out.println("Press 2 to fill water tank");
          //  } else if (beansLevel <= 30){
            //    System.out.println("Press 3 to fill beans tank");
           // } else if (dirtyLevel >=100){
             //   System.out.println("Your machine is dirty, executing Cleanning");
               // clean();
            //} else if (on=true&&waterLevel>=300&&beansLevel>=30&&dirtyLevel<=100){
        //System.out.println("Your machine is ready");
    //}  
    //}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lab2 myLab = new Lab2();
        Scanner reader = new Scanner(System.in);
        myLab.instruction();
        System.out.println("Your command please: ");
        
        while(true){
            int command = Integer.parseInt(reader.nextLine());
             //  myLab.checking();
            
            if (command == 0){
                myLab.instruction();
            } else if (command == 1){
                myLab.pressPower();
            } else if (command == 2){
                myLab.fillWater();
            } else if (command == 3){
                myLab.fillBeans();
            } else if (command == 4){
                myLab.pressEspresso();
            } else if (command == 5){
                myLab.pressRegular();
            } else if (myLab.dirtyLevel >=100){
                myLab.clean();
            } else {
                System.out.println("Please only press from 0 ~ 5");
            }
             System.out.println("Your command please: ");   
        }
     }    
}
