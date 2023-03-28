public class Dog
{
    String color="red";
    public void run()
    {
        System.out.println("Run");
    }
     public void walk()
    {
                System.out.println("Walk");
    }
     public void eat()
    {
                System.out.println("Eat");
    }

    public  static void main(String args[])
    {
        System.out.println("I am A main Method");
        Dog d=new Dog();
        d.eat();
        d.walk();
        d.run();
    System.out.print("color is "+d.color);
    }
}