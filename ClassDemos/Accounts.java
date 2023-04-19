class Account123 {
    String ac_holder_name;
    double bal;

    void Deposite()
    {
        System.out.println("Successfully Depost");
    }
}
class Loan extends Account123
{
    void AcInfo()
    {
        System.out.println("ac_holder_name"+ac_holder_name+"Ac Bal is "+bal);
    }
}

class Accounts
{
    public static void main(String[] args) {
        Loan l=new Loan();
        l.ac_holder_name="Nabi";
        l.bal=12345;
        l.AcInfo();
        l.Deposite();
    }
}
