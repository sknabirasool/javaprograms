package Strings;

import java.util.StringTokenizer;

public class StringTokensSemo {
    public static void main(String[] args) {
        
        //Hi Rajesh
        StringTokenizer st=new StringTokenizer("sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity,sno,sname,age,amount,date,closedate,txndate,sysdate,bcode,bcity");

        while(st.hasMoreTokens()) //true //true// true //true //fasl
        {
            // System.out.println(st.nextToken());
            System.out.println("Data  "+st.nextToken(",")); 
        }
    }
    
}
