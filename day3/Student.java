public class Student
{
    public String StudentName;
    public int marks;

    public void SetStudentName(String name)
    {
       StudentName=name; 
    }
    public void marks(int smarks)
    {
        marks=smarks;
    }
    public void printStudent()
    {
        System.out.println("Student Name is "+StudentName+" and marks are "+marks);
    }
public static void main(String args[])
{
    Student s=new Student();
    s.SetStudentName("Nabi");
    s.marks(200);
    s.printStudent();
}
   

}