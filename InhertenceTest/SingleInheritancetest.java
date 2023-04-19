package InhertenceTest;

class Father{ //parent class base class super class 

    String name="Ramu";
    int age=40;
    int height=6;
    int weight=70;
    String mothername="Deepa";
    int mage=30;
    int mheight=5;
    int mweight=60;

    public void father()
    {
        System.out.println("I am Father");
    }
    public void mother()
    {
        System.out.println("I am mother method");
    }
}

class Son extends Father //child
{
   String Sname="Rajesh";
   int Sage=10;
}

class SingleInheritancetest
{
    public static void main(String[] args) {
        Son o=new Son();

        System.out.println("Father Name Is "+o.name+"Father age is"+o.age);
        System.out.println("Mother Name Is "+o.mothername+"Mother age is"+o.mage);
        System.out.println("Son Name Is "+o.Sname+" Son age is "+o.Sage);

        o.father();
        o.mother();

    }
}