class StaticMethods
{
    static int a=10;
    static void show()
    {
        System.out.println(a+5);
    }
    static
    {
        a=a*5;
        System.out.println(a);
    }
    public static void main(String args[])
    {
        System.out.println("Hello");
        System.out.println(a);
        System.out.println(Main.a);
        Main.show();
    }
}