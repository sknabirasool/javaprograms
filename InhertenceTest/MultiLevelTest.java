package InhertenceTest;

class A{
    int a=100;
    public void MethodA()
    {
        System.out.println("Method Name is A");
    }
}
class B extends A{
    int b=200;
    public void MethodB()
    {
        System.out.println("Method Name is B");
    }

}
class C extends B{
    int c=300;
    public void MethodC()
    {
        System.out.println("Method Name is C");
    }

}

public class MultiLevelTest {

    public static void main(String[] args) {
        
        C obj=new C();

        obj.MethodA();
        obj.MethodB();
        obj.MethodC();
        
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
    
}
