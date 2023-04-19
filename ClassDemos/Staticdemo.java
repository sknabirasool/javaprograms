public class Staticdemo {
    static int a=20;
    static void demo()
    {
        System.out.println("Hello Static Method");
    }
    static
    {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        demo();
        System.out.print(a);
    }
}
