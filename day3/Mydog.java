public class Mydog
{
    String color="white";
    int height=20;
    int weight=40;// properties or objects or variables or attributes

    void eat() //methods
    {
        System.out.println("Dog is eating");

    }
    void run() ////methods
    {
        System.out.println("Dog is running");
    }
    void barking() ////methods
    {
        System.out.println("Dog is barking");   
    }

    public static void main(String args[])
    {
        System.out.println("Main method");

        Mydog obj=new Mydog();

        obj.run();
        obj.barking();
        obj.eat();
        
    }
}