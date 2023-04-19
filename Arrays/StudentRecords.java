package Arrays;

public class StudentRecords {
    
    public static void main(String[] args) {
        
        String names[]={"Mahesh","Nabi","Akashara","Srinivas"};
        int marks[]={400,500,450,300};
        char section[]={'A','B','C','D'};
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]+" in Section "+section[i]+" got "+marks[i]+" Marks");
        }

    }
}
