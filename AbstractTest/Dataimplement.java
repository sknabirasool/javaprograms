package AbstractTest;


class Dataimplement1 extends AbstractTestDemo{

   public void withdraw(int amount)
    {
        System.out.println(amount);

    }
    public void Deposite(int amount)
    {
        System.out.println(amount);
    }
}

class DaataItem2 extends AbstractTestDemo
{
    public void withdraw(int amount)
    {
        System.out.println(amount);

    }
    public void Deposite(int amount)
    {
        System.out.println(amount);
    }
}

public class Dataimplement
{
    public static void main(String args[])
    {
        AbstractTestDemo o=new Dataimplement1();
        o.withdraw(100);
        o.Deposite(400);
        DaataItem2 obj=new DaataItem2();

        obj.Deposite(100);
        obj.withdraw(100);

    }
}
