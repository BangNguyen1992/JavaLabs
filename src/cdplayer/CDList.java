/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdplayer;

import java.util.ArrayList;

/**
 *
 * @author Bang Nguyen
 */
public class CDList {
    private ArrayList<String> list1;
    public CDList(){
      list1 = new ArrayList();
    
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        
        
        
    }
      
      public ArrayList<String> getList(){
          return list1;
      }
}
