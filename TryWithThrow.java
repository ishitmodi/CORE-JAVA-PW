class TryWithThrow
{
    public static void main (String args[])
    {
        int a=10 , b=1 , c;
        try
        {
            if(b == 1)
            {
                throw new ArithmeticException(" Divided by one");
            }
            else
            {
                c=a/b;
                System.out.println(c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}