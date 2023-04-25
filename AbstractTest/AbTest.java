package AbstractTest;

class SavingAccount1 extends AbstractTestDemo
{
    public void withdraw(int amount)
    {
        int current_bal=1000;

        amount=current_bal-amount;
        System.out.println("withdraw amount is "+amount);
    }

    public void Deposite(int amount)
    {
        int current_bal=0;

        amount=current_bal+amount;

        System.out.println("Deposite amount is "+amount);

    }

}


class DeposteAccount1 extends AbstractTestDemo
{
    public void withdraw(int amount)
    {
        int current_bal=1000;

        amount=current_bal-amount;
        System.out.println("withdraw amount is "+amount);
    }

    public void Deposite(int amount)
    {
        int current_bal=0;

        amount=current_bal+amount;

        System.out.println("Deposite amount is "+amount);

    }

}


class LoanAccount1 extends AbstractTestDemo
{
    public void withdraw(int amount)
    {
        int current_bal=1000;

        amount=current_bal-amount;
        System.out.println("withdraw amount is "+amount);
    }

    public void Deposite(int amount)
    {
        int current_bal=0;

        amount=current_bal+amount;

        System.out.println("Deposite amount is "+amount);

    }

}

public class AbTest { 
    public static void main(String[] args) {

       

        SavingAccount1 obj=new SavingAccount1();

        obj.Deposite(5000);
        obj.withdraw(10);
        obj.BankName1();

        DeposteAccount1 ob=new DeposteAccount1();
        ob.Deposite(1000000);
        ob.withdraw(1000000);

        LoanAccount1 loan=new LoanAccount1();
        loan.Deposite(2);
        loan.withdraw(1);
        
    }
    
}
