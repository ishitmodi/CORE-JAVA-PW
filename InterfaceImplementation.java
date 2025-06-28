interface First
{
    int x = 10;
    void show();
}

interface Second
{
    int x = 20;
    void display();
}

class Base implements First,Second
{
    public void show()
    {
        System.out.println("Hello from Show");
    }
    
    public void display()
    {
        System.out.println("Hello from Display");
    }
    
    void xyz()
    {
        System.out.println(First.x);
        System.out.println(Second.x);
    }
}

class InterfaceImplementation 
{
    public static void main (String[] args)
    {
        Base b = new Base();
        b.show();
        b.display();
        b.xyz();
    }
}