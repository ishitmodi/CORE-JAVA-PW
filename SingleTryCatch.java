class SingleTryCatch
{
    public static void main (String args[])
    {
        int a=10 , b=0 , c;
        try
        {
            c = a/b; //JRH will handle this error
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Don't divide by zero");
        }
        System.out.println("Bye");
    }
}