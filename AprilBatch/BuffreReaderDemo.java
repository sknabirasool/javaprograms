package AprilBatch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffreReaderDemo {
    public static void main(String[] args) {
        
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Your Name");
            String name=br.readLine();
       
            System.out.println("Enter your Emp ID");
            int empid=Integer.parseInt(br.readLine());
            System.out.println("Your Name is"+name+"Your Emp Id is "+empid);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
       
    }
    
}
