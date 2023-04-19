package InhertenceTest;

class A{

    public void msg()
    {
        System.out.println("Message");
    }

}
class B{
    public void msg()
    {
        System.out.println("Message");
    }

}

class C extends A,B{
    public void msg()
    {
        System.out.println("Message");
    }

}

public class Multiple {
    public static void main(String[] args) {

        B obj=new B();

        obj.msg();
        
    }
    
}
