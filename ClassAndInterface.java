interface First
{
    void show();
}

interface Second
{
    void display();
}

class Base
{
    void abc()
    {
        System.out.println("Hello from Base Class");
    }
}

class Derive extends Base implements First,Second
{
    public void show()
    {
        System.out.println("Hello from Show");
    }
    
    public void display()
    {
        System.out.println("Hello from Display");
    }
}

class ClassAndInterface 
{
    public static void main (String[] args)
    {
        Derive d = new Derive();
        d.show();
        d.display();
        d.abc();
    }
}