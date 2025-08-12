class Base
{
    void show()
    {
        System.out.println("Hello From Parent Class Of Single Level Inheritence");
    }
    int a=10;
}

class Derive extends Base
{
    int a=20;
    void display()
    {
        System.out.println("Hello From Child Class Of Single Level Inheritence");
        int a=5;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        
    }
}

public class Main
{
    public static void main(String args[])
    {
        Base b1 = new Base();
        Derive d1 = new Derive();
        b1.show();
        d1.show();
        d1.display();
    }
}