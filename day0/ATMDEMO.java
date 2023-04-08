import java.util.Scanner;
public class ATMDEMO {
    
    public static void main(String[] args) {
        
        int balance=10000,withdraw,deposit;

        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("ATM Machine Demo");
            System.out.println("Withdraw -1");
            System.out.println("Deposit-2");
            System.out.println("Check Balance-3");
            System.out.println("Exit-4");

            System.out.println("Enter Your Choise");
            int n=sc.nextInt(); //2

            switch(n)//2
            {
                case 1: System.out.println("Enter Your Withdraw Amount");
                        withdraw=sc.nextInt();
                        if(balance>=withdraw) //11>12
                        {
                            balance=balance-withdraw; //10000-500=9500
                            System.out.println("Please Collect the amount");
                        }
                        else
                        {
                            System.out.println("In Suffient balance");
                        }
                        System.out.println("");
                        break;
                case 2: System.out.println("Enter the Amount For Depost");
                        deposit=sc.nextInt(); //2000
                        balance=balance+deposit; //9500+2000=11500
                        System.out.println("Successfully Deposited");
                        System.out.println("");
                        break;      
                        
                case 3: System.out.println("my balance is "+balance);
                         System.out.println("");
                         break;
                case 4:
                System.exit(0);
            }
        
        }

    }
}
