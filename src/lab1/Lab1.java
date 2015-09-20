/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Bang
 */
import java.util.Scanner;
public class Lab1 {

    private int waterLevel;
    private boolean on;
    private boolean coverOn;
    
    public void instanceWaterLevel(){
        waterLevel = 0;
        on = false;
        coverOn = false;
        
    }
    public void checkWaterLevel (){
        System.out.println("\r");
        System.out.println("the water level is " +waterLevel);
        if (on == false){
            System.out.println("The power is off, please turn on by pressing 1");
        } else {
            System.out.println("The power is on, if you want to turn it off, please press 1");
        }
        if (coverOn = false){
            System.out.println("The lid is openned, please close it by pressing 4");
        } else {
            System.out.println("The lid is close, if you want to open it, please press 4");
        }
        System.out.println("\r");
    }
    public void pressWaterButton(){
        if (waterLevel>=10 && on == true){
            System.out.println("Here's your water");
        } else  {
            System.out.println("Sorry, there is no water or the power is off, please fill the water tank by pressing 2 or turn power on by pressing 1");
        }
    }
    public void fillTank(){
        waterLevel = 100;
        System.out.println("You have filled the water tank");
        if(waterLevel == 100){
            System.out.println("The tank is full");
        }
    }
    public void lid(){
        if (coverOn == false){
            openLid();
        } else {
            closeLid();
        }
    }
    public void openLid(){
        coverOn = false;
        System.out.println("You have openned the Lid");
    }
    public void closeLid(){
        coverOn = true;
        System.out.println("You have closed the Lid");
    }
    public void pressOnOff(){
        if (on==true){
            turnOff();
        } else {
        turnOn();
    }
    }
    public void turnOn(){
        on = true;
        System.out.println("You have turned the power on");
    }
    public void turnOff(){
        on = false;
        System.out.println("You have turned the power off");
    }
    public void manual(){
        System.out.println("\r");
        System.out.println("Press 0 to check water level");
        System.out.println("Press 1 to power on/off");
        System.out.println("Press 2 for filling water");
        System.out.println("Press 3 to get water");
        System.out.println("Press 4 to open/close lid");
        System.out.println("\r");
    }  
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
    Lab1 myLab = new Lab1(); 
    
        myLab.manual();
        while (true){
        myLab.checkWaterLevel();
    int command = Integer.parseInt(reader.nextLine());
    if (command == 0){
        myLab.checkWaterLevel();
    } else if (command == 1){
        myLab.pressOnOff();
    } else if (command == 2){
        myLab.fillTank();
    } else if (command == 3){
        myLab.pressWaterButton();
    } else if (command == 4){
        myLab.lid();
    }
        // TODO code application logic here
    }
    
}
}
