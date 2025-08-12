class SingleTryMultipleCatch
{
    public static void main (String args[])
    {
        int a=10 , b=0 , c , d[]={1,2,3};
        try
        {
            c = a/b; //JRH will handle this error
            System.out.println(c);
            System.out.println(d[3]);//this will not throw an exception because JRH will not come to this
        }
        catch(ArithmeticException e)
        {
            System.out.println("Don't divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index not exist");
        }
        System.out.println("Bye");
    }
}