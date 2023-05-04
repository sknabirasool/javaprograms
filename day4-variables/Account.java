


public class Account
{

   public String name;
   public int AccountNumber;
   public double bal;

   public void setName(String names)
   {
        name=names;
   }
   public void SetAccountNo(int acno)
   {
    AccountNumber=acno;
   }
   public void setbal(double amount)
   {
      bal=amount;
   }

   public void PrintBankAccount()
   {
     System.out.println("your Account Number is"+AccountNumber+" Your Name is "+name+" Your bank bal is"+bal);
   }
 
 public static void main(String args[])
 {
    Account obj=new Account();
    obj.setName("Nabi Shaik");
    obj.SetAccountNo(123456789);
    obj.setbal(2000000);
    obj.PrintBankAccount();
 }
   

}