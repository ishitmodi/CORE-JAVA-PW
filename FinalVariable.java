class FinalVariable
{
    final int a;
    Main(int x)
    {
        a = x;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main (String[] args)
    {
        Main t1 = new Main(10);
        Main t2 = new Main(100);
        t1.show();
        t2.show();
    }
}