package AprilBatch;

public class ContinoueTest {

    public static void main(String[] args) {
        
        for(int i=1;i<=20;i++)
        {
            if(i>5 && i<10)
            {
               continue;
            }
            System.out.println(i);
        }
    }
    
}
