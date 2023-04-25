package AprilBatch;

import java.io.FileInputStream;

public class FileReadTest {
    
    public static void main(String[] args) {
        try
        {
        FileInputStream fin=new FileInputStream("E:\\Training\\CubeWay\\javaprogramming\\AprilBatch\\fileData.txt");
        int i=0;
        
        while((i=fin.read())!=-1)
        {
            System.out.print((char)i);
        }
         fin.close();
        }
        catch(Exception e)
        {
          System.out.println("failure Message "+e);
        }
        }
}
