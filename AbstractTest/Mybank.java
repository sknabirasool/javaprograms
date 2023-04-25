package AbstractTest;

abstract class Bank
{
    abstract void DepositAmount(int amount); //abstract Method 
   
}

class SavingAccount extends Bank
{
    void DepositAmount(int amount)
    {
        int current_bal=1000;
        current_bal=current_bal+amount;
        System.out.println("Saving Account Balance is "+current_bal);
    }
}

class CurrentAccount extends Bank
{
    void DepositAmount(int amount)
    {
        int cb=100;
        cb=cb+amount;
      System.out.println("Current Account Balance is "+cb);
    }

}

class LoanAccount extends Bank
{
    void DepositAmount(int amount)
    {
        int lb=100;
        lb=lb+amount;
      System.out.println("Loan  Account Balance is "+lb);
    }

}

public class Mybank {
    public static void main(String[] args) {

        Bank sa=new SavingAccount();

    
        sa.DepositAmount(2000);
         
        Bank ca=new CurrentAccount();

        ca.DepositAmount(5000);

    Bank la=new LoanAccount();
    la.DepositAmount(2503);

       
    }
    
}
