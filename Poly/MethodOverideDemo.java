package Poly;
 
class Parent
{
    void msg()
    {
        System.out.println("Parent Method");
    }
}
class Child extends Parent
{
    void msg()
    {
        System.out.println("Child Method");
    }

}

public class MethodOverideDemo {
     public static void main(String[] args) {

        Parent p=new Child(); //downcastio
         p.msg();

     }
    
}
