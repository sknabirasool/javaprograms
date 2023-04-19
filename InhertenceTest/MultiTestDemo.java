package InhertenceTest;

interface CreditCard
{
    void rupees();
    void dollers();
}

class Bank implements CreditCard
{
    public void rupees()
    {
        System.out.println("Money Rupess");
    }

    public void dollers()
    {
        System.out.println("Money convert to dollers");
    }
}
public class MultiTestDemo {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.dollers();
        b.rupees();
        
    }
   
    
}
