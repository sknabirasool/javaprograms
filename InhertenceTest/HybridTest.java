package InhertenceTest;

class A{
    
    public void MethodA()
    {
        System.out.println("Method A");
    }
}
class B extends A{
    
    public void MethodB()
    {
        System.out.println("Method B");
    }
}
class C extends A{
    
    public void MethodC()
    {
        System.out.println("Method C");
    }
}

class D extends B{

    public void MethodD()
    {
        System.out.println("Method D");
    }
}


class DD extends C{

    public void MethodDD()
    {
        System.out.println("Method DD");
    }
}

public class HybridTest {

    public static void main(String[] args) {

        DD obj=new DD();
        obj.MethodDD();
        obj.MethodC();

        D obj1=new D();

        obj1.MethodD();
        obj1.MethodB();

        B obj2=new B();

  
        obj2.MethodA();



        
    }
    
}
