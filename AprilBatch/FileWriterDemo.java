package AprilBatch;

import java.io.FileOutputStream;

public class FileWriterDemo {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fout=new FileOutputStream("FileOut.txt");
            String s="Java FileOutputStream is an output stream used for writing data to a file wilicw";
            byte b[]=s.getBytes();//convert to string into bytes array
            fout.write(b);
            fout.close();
            System.out.println("Successfuly written");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     
    }
    
}
