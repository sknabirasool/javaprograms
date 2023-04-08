package Arrays;
import java.util.*;;
public class ArrayTest {

    public static void main(String[] args) {
        
       // Syntax:datatype variablename[]=new datatype[size];
       String phones[]=new String[5];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr the mobile phones");
       for(int i=0;i<=phones.length-1;i++)
       {
            phones[i]=sc.nextLine();
       }

       for(int i=0;i<=phones.length-1;i++)
       {
        System.out.println(phones[i]);
       }

    }
    
}
