package AprilBatch;

public class NestedIfTestCase {
    
    public static void main(String[] args) {
        
        int age=15;
        int weight=50;

        if(age>=18)
        {
            if(weight>=40)
            {
                System.out.println("you are eligiblue for donate blood");
            }
            else
            {
                System.out.println("you are not  eligiblue for under weight");
            }
        }
        else
        {
            System.out.println("you are age is less than 18");
        }
    }
    
}
