package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class ArryListCollection
{
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();

        list.add("Mahesh");
        list.add("Rajesh");
        list.add("Ravi");
       
   


        System.out.println(list.get(0));

        list.set(0, "SHAIK NABI RASOOL");

        for(String name:list)
        
        System.out.println(name);
       
    }
}