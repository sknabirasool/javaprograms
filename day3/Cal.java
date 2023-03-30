public class Cal{

    public int c=2000;
    public int add()
    {
        int a=0;//localvariables
        int c=a+2000;
        return c;
    }
    
    public static void main(String args[])
    {
       
        Cal obj=new Cal();
        System.out.println(obj.add());
        System.out.println(obj.add());//2000
   
    }
}