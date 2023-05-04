package Encapsulation;

class Etest1 {
    private int roolno;

    public int getRoolno() {
        return roolno;
    }

    public void setRoolno(int roolno) {
        this.roolno = roolno;
    }
    
}

class Etest
{
    public static void main(String[] args) {
        
        Etest1 obj=new Etest1();
        obj.setRoolno(10000);
        System.out.println(obj.getRoolno());
 
    }
    
}
