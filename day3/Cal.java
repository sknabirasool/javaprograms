public class Cal{

    String name="calculater";
    public int add()
    {
        int a=0;//localvariables
        int c=a+2000;
        return c;
    }
    public static void main(String args[])
    {
        int a=0;
        System.out.println(a);
        Cal obj=new Cal();
        System.out.println(obj.add());
        System.out.println("name is "+obj.name);
    }
}