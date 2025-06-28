interface First
{
    void show();
}

interface Second extends First
{
    void display();
}

class Derive implements Second
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

class InterfaceExtend
{
    public static void main (String[] args)
    {
        Derive d = new Derive();
        d.show();
        d.display();
    }
}