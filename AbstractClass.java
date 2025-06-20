abstract class Base
{
    abstract void show();
    void display()
    {
        System.out.println("Hello from Base class");
    }
}

class Derive extends Base
{
    void show()
    {
        System.out.println("Hello from Derive class");
    }
}

class AbstractClass
{
    public static void main (String[] args)
    {
        Derive d1 = new Derive();
        d1.show();
        d1.display();
    }
}