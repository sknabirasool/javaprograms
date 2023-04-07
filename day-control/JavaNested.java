//Java Program to demonstrate the use of Nested If Statement.  
public class JavaNested {    
    public static void main(String[] args) {    
        //Creating two variables for age and weight  
        int age=25;  
        int weight=40;    
        //applying condition on age and weight  
        if(age>=18)
        {    
                    if(weight>50){  

                        System.out.println("You are eligible to donate blood");  
                    }   
                    else{
                        System.out.println("You are not eligible because of less weight");  
                    } 
        }  
        else{
            System.out.println("You are age is  less than 20");  
        }  
    }
}  