import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    
    public static void main(String[] args) {
        try
        {
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please Enter Employye Name");
            String name=br.readLine();
            System.out.println("please enter Employee Father Name");
            String father_name=br.readLine();
            System.out.println("<----------------------->");
            System.out.println("Employee Details");
            System.out.println(name);
            System.out.println(father_name);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
      

        
    }
}
