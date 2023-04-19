package StaticData;

class TestStaticDemo2{
   
    private static String str = "Cubicway.com";
    //Static class
    static class MyNestedClass{
     //non-static method
     public void disp() 
     {
      System.out.println(str); 
     }
    }
    public static void main(String args[])
    {
     TestStaticDemo2.MyNestedClass obj = new TestStaticDemo2.MyNestedClass();
     obj.disp();
    }
 }
 