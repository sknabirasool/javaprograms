package Arrays;

public class Test {
    public static void main(String[] args) {
        
     String names[]={"Nabi","Babu","Rajesh","mahesh"};
     int marks[]={200,400,234,500};
     char sec[]={'C','A','C','A'};
   
        for(int i=0;i<names.length-1;i++)
        {
            System.out.println(names[i]+" in section "+sec[i]+" got "+marks[i]+" marks ");
        }

    }
}
