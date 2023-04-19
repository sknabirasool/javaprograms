package InhertenceTest;

class A{

    int a=20;
    public void MethodA()
    {
        System.out.println("Method A");
    }
}

class B extends A{

    int b=20;
    public void MethodB()
    {
        System.out.println("Method B");
    }

}
class C extends A{

    int c=20;
    public void MethodC()
    {
        System.out.println("Method C");
    }

}
public class HerichTest {
    public static void main(String[] args) {

        C obj=new C();
        B obj1=new B();

        obj.MethodC();
        obj.MethodA();
        obj1.MethodB();

        System.out.println(obj.a);
        System.out.println(obj.c);

        System.out.println(obj1.b);

        
    }
    
}
