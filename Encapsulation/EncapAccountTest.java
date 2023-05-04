package Encapsulation;

class PrivateSavingAccount
{
    private int accNo;
    private String accHolderName;
    private int accBal;

    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public String getAccHolderName() {
        return accHolderName;
    }
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public int getAccBal() {
        return accBal;
    }
    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

}
public class EncapAccountTest {

    public static void main(String[] args) {
        PrivateSavingAccount obj=new PrivateSavingAccount();

        obj.setAccNo(231575127);
        obj.setAccHolderName("Nabi Shaik");
        obj.setAccBal(10000);


     System.out.println("Acccount Holder Name is "+obj.getAccHolderName()+" Account Number is "+obj.getAccNo()+" Account Bal is "+obj.getAccBal());


    }
    
}
