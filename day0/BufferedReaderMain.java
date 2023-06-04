 
import java.io.*; //import io package for BufferedReader class
 
public class BufferedReaderMain
{
    public static void main(String args[])
    {
        try //exception handling is done  here using try and catch block because sometimes  exception occur when uses io classes
        {
            // creation of BufferedReader object
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
            System.out.print("Enter Student name:");
            String name=br.readLine(); // to read from console
 
            System.out.println("Enter Student number:");
            int num=Integer.parseInt(br.readLine()); //parsing of string into into integer type using wrapper class
                        // Printing employee Details
                System.out.println("Student  details:");
            System.out.println("Student name is:" +name);
            System.out.println("Student number is:" +num);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());//err
        }
    }
}