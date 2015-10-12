/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdplayer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bang Nguyen
 */
public class CDPlayer {
private boolean on = false;
private boolean running = false;
private int vol;
private CDList song;
private String state;
private String title;

public void CDPlayer (){
    this.vol = 0;
    this.state = "Stopped";
    
}
public void powerOnoff(){
    if(on==false){
        on = true;
        System.out.println("The Power is ON");
    } else {
        on = false;
        System.out.println("The Power is OFF");
    }
}

public void insertCD(){
   if(on==true){
       song = new CDList();
   
    ArrayList list1 = song.getList();
    
    System.out.println("Inserted songs "+list1);
    } else{
       System.out.println("Please turn On the CD player");
   }
      }
public void next(){
    
}
public void previous(){
    
}
public void play(){
    Scanner s1 = new Scanner(System.in);
    System.out.print("Enter the song's title:");
        title = s1.nextLine();
        if(song.getList().contains(title) && on == true){
    System.out.println("the song "+ title+" are "+state);
    state = "Playing";
        } else if(on == false) {
            System.out.println("Please turn ON power");
        } else if (!song.getList().contains(title)){
            System.out.println("That song doesnt have in the list, please import the song to list");
        }
}
public void stop(){
    state = "Stopped";
    System.out.println("You have "+state);
    
}
public void pause(){
    state = "Paused";
    System.out.println("You have "+state);
}
public void volUp(){
    if (vol <=100){
        vol++;
        System.out.println("The volume increase to "+vol);
    } else {
        System.out.println("The volume is max");
    }
}
public void volDown(){
    if(vol>=0){
        vol--;
        System.out.println("The volume decrease to "+vol);
    } else{
        System.out.println("The volume is min");
    }
}


public void importSong(){
    Scanner s2 = new Scanner(System.in);
    System.out.print("Enter the song's title:");
    title = s2.nextLine();
    
}
public void deleteSong(){
    Scanner s3 = new Scanner(System.in);
    System.out.print("Enter the song's title:");
    title = s3.nextLine();
    song.getList(list1).add(title);
    
}
public void manual(){
    System.out.println("Press 0 to power ON/OFF");
    System.out.println("Press 1 to playing");
    System.out.println("Press 2 to pause");
    System.out.println("Press 3 to stop");
    System.out.println("Press 4 to go to next song");
    System.out.println("Press 5 to go to previous song");
    System.out.println("Press 6 to increase volume");
    System.out.println("Press 7 to decrease volume");
    System.out.println("Press 8 to add song to list");
    System.out.println("Press 9 to remove song from list");

}
}
