package Exceptions;
public class ExceptionDemo {
    public static void main(String[] args) {

        try {
           String s="Hello";  //null 
           System.out.println(s.charAt(0));
        } 
        catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("null data exception"+e);
        }
       

    }
    
}
