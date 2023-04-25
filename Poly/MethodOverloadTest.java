package Poly;


class CalculateData
{
    //Changing parameters
    public int  Add(int a, int b)
    {
        return a+b;
    }
    public int  Add(int a,int b,int c)
    {
        return a+b+c;
    }
    //  return datatype change 

    public double Add(double a, double b)
    {
        return a+b;
    }

    public void Add(int a,int b,int c ,int d)
    {
         System.out.println(a+b+c+d);
    }


}
public class MethodOverloadTest {

    public static void main(String[] args) {
        CalculateData obj=new CalculateData();
        System.out.println(obj.Add(100, 200));
        System.out.println(obj.Add(100, 200, 300));
        System.out.println(obj.Add(20, 20));
       
        obj.Add(1, 100, 200, 1000);

    }

    
}
