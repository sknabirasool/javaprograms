

public class Account {

    int acno=123456; //variables or properties or data items or fields 
    String ac_holder_name="Shaik Nabi";

    public int  Deposite(int bal)
    {
       
        return bal;
    }
    
    public static void main(String[] args) {

        Account obj=new Account();

     System.out.println("Account Holder Name is "+obj.ac_holder_name+" Account Number is"+obj.acno);
     
    System.out.println(obj.Deposite(3000));
     
    }
}
