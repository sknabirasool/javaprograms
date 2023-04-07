import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferDemo {
    public static void main(String[] args) {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Employee Name");
            String name=br.readLine();
            System.out.println("Enter Empid");
            int empid=Integer.parseInt(br.readLine());
            System.out.println("Employee Print Details");
            System.out.println(name);
            System.out.println(empid);
        }
        catch(Exception e){
        System.out.println(e);
        }
    }
}
