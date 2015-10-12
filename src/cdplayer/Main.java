/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdplayer;

import java.util.Scanner;

/**
 *
 * @author Bang Nguyen
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
    CDPlayer myPlayer = new CDPlayer(); 
    myPlayer.insertCD();
    myPlayer.manual();
    while (true){
       // myLab.checkWaterLevel();
    int command = Integer.parseInt(reader.nextLine());
    if (command == 0){
        myPlayer.powerOnoff();
    } else if (command == 1){
        myPlayer.play();
    } else if (command == 2){
        
   /* } else if (command == 3){
        myPlayer.pressWaterButton();
    } else if (command == 4){
        myPlayer.lid();
    } else if (command == 5){
        myPlayer.pressValve();
    } else if (command == 6){
        myPlayer.manual();
    }
        // TODO code application logic here
    }*/
}
        }
    }
}