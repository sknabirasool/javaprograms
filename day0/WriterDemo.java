import java.io.FileOutputStream;

public class WriterDemo {
    public static void main(String[] args) {
        
        try{
            FileOutputStream fout=new FileOutputStream("writer.txt");
            String s="Welcome to java fullstack batch demo";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Successfully written the data into a file");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
