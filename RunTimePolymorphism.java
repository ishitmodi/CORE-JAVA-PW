class Base
{
    void show()
    {
        System.out.println("Hello from Base");
    }
}

class Derive extends Base
{
    void show()
    {
        System.out.println("Hello from Derive");
    }
}

class DeriveSecond extends Base
{
    void show()
    {
        System.out.println("Hello from DeriveSecond");
    }
}

class RunTimePolymorphism
{
    public static void main (String[] args)
    {
        Base b1; //Refernce of base Class
        Derive d1 = new Derive(); //Object of derive Class
        DeriveSecond ds1 = new DeriveSecond();
        b1 = d1;
        b1.show();
        b1 = ds1;
        b1.show();
    }
}