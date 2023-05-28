package Collections;

import java.util.*;  
public class MapDemo{  
 public static void main(String args[]){  
   
    HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   //Put elements in Map  
   map.put(2,"Apple");    
   map.put(2,"Apple");   
   map.put(4,"Grapes");   
   map.put(1,"Ana"); 
   map.put(1,"Mango"); 
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}
