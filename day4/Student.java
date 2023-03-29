public class Student
{
    public int rollno;//instans variables
    public String name;//instans variables
    public int marks; //instans variables

    public void setRollNo(int r)
    {
        rollno=r;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setMarks(int m)
    {
         marks=m;
    }
    public void printStudentRecord()
    {
        System.out.println("Student Name is "+name+ "Student roll no is "+rollno+" Student Marks are "+marks);
    }

public static void main(String args[])
{
    Student s=new Student();
    s.setRollNo(74832);
    s.setName("Nabi Shaik");
    s.setMarks(400);
    s.printStudentRecord();
}

}