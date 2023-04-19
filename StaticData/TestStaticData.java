package StaticData;

public class TestStaticData {

    static String name="Shaik Nabi Rasool";

    static String notification="Server is unavailbe";

    static int deptno=123;

    static void getData()
    {
        System.out.println("name is"+name+" dept no is "+deptno);
    }

    static
    {
        System.out.println("Static block ");
    }
    
    public static void main(String[] args) {

        // TestStaticData obj=new TestStaticData();

        System.out.println("Main Method");
        getData();
        
    }
}
