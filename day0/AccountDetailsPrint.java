import java.util.*;
public class AccountDetailsPrint {
    public static void main(String[] args) {
        int acno;
        String ac_holder_name;
        int bal;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Acc Number");
        acno=sc.nextInt();
        
        System.out.println("Enetr The Account balance");
        bal=sc.nextInt();//1000

        System.out.println("Enter Name");
        ac_holder_name=sc.next();

        System.out.println("Account Details ");
        System.out.println(acno);
  
        System.out.println(bal);

        System.out.println(ac_holder_name);


    }
    
}
