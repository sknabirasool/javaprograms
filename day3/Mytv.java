public class Mytv
{
     int price=100000;
    String tvname="XYZ";

    void increasevolume()
    {
       int price=100000;
       System.out.println("I am going to increse Tv value");
       System.out.println("TV name is"+price);
    }
    void Decresevolume()
    {
       System.out.println("I am going to Decrease Tv value");
    }

    public static void main(String args[])
    { 
        Mytv tv=new Mytv();
        tv.increasevolume();
        tv.Decresevolume();

        System.out.println("TV name is"+tv.tvname);
        
    }
}