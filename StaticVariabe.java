class StaticVariabe
{
    static int a;
    public static void main(String args[])
    {
        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();
        t1.a=10;
        t2.a=20;
        t3.a=30;
        System.out.println(t1.a);
        System.out.println(t2.a);
        System.out.println(t3.a);
        System.out.println(a);
        System.out.println(Main.a);
    }
}