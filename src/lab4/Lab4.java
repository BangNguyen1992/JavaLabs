/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Bang
 */
import java.util.Scanner;
public class Lab4 {

    private int waterLevel;
    private boolean on;
    private boolean coverOn;
    private boolean valve;
    
    public void instanceWaterLevel(){
        waterLevel = 0;
        on = false;
        coverOn = false;
        valve = false;
        
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
        if (valve == false){
            System.out.println("The valve is closed. Please open the valve by pressing 5");
        } else {
            System.out.println("The valve is opened. Close the valve by pressing 5");
        }
        System.out.println("\r");
    }
    public void pressWaterButton(){
        if (waterLevel>=10 && on == true && valve == true){
            System.out.println("How much water do you want?");
            Scanner s = new Scanner(System.in);
            int input = Integer.parseInt(s.nextLine());
            
            if (input>=waterLevel){
                System.out.println("Please set your input lower than "+waterLevel);
                
            } else {
            System.out.println("Here's your water " +input);
            waterLevel = waterLevel - input;
            int a =0;
            while (a<=input){
                System.out.print("*");
                a++;
            }
        }
            
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
        System.out.println("You have turned the power On");
    }
    public void turnOff(){
        on = false;
        System.out.println("You have turned the power OFF");
    }
    public void manual(){
        System.out.println("\r");
        System.out.println("Press 0 to check water level");
        System.out.println("Press 1 to power on/off");
        System.out.println("Press 2 for filling water");
        System.out.println("Press 3 to get water");
        System.out.println("Press 4 to open/close lid");
        System.out.println("Press 5 to open the valve");
        System.out.println("Press 6 to open manual");
        System.out.println("\r");
    }  
    public void pressValve(){
        if(valve == false){
            valve = true;
            System.out.println("Valve is opened");
        } else {
            valve = false;
            System.out.println("Valve is closed");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
    Lab4 myLab = new Lab4(); 
    
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
    } else if (command == 5){
        myLab.pressValve();
    } else if (command == 6){
        myLab.manual();
    }
        // TODO code application logic here
    }
    
}
}
