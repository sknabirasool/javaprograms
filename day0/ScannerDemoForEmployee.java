import java.util.Scanner; //import util hpackage for Scanner class
 
public class ScannerDemoForEmployee
{
    public static void main(String args[])
    {
        int id;
        String name;
        float salary;
        Scanner sc=new Scanner(System.in);
 
        System.out.println("Enter Employee  name:");
        name = sc.nextLine(); //taking string input
 
        System.out.println("Enter Employee Id:");
        id = sc.nextInt(); //taking integer input
 
        System.out.println("Enter Employee Salary:");
        salary = sc.nextFloat(); //taking float input
 
        // Printing employee Details
        System.out.println("Employee  details:");
        System.out.println("Employee  name is: " +name);
        System.out.println("Employee  id is: " +id);
        System.out.println("Employee  salary is: " +salary);
        sc.close();
    }
}
 
