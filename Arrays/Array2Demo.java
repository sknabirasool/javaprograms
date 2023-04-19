package Arrays;

public class Array2Demo {
    
    public static void main(String[] args) {
        
        int a[][]={{1,2,3,},
                   {4,5,6},
                   {7,8,9}
                };

       // c0 c1 c2
        
        // 1 2 3  row 0
        // 3 4 5  row 1
        // 6 7 8  row 2


        for(int i=0;i<a.length;i++) //row  2
        {
            for (int j=0;j<a.length;j++) // col 2
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
   
     
    }
}
