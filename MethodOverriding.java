class Base
{
    void show()
    {
        System.out.println("Hello From Class Base");
    }
}

class Derive
{
    void show()
    {
        System.out.println("Hello From Class Derive");
    }
}

class MethodOverriding
{
    public static void main(String args[])
    {
        Base b1 = new Base();
        Derive d1 = new Derive();
        b1.show();
        d1.show();
    }
    

}