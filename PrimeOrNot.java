import java.util.Scanner;
class PrimeOrNot
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int i;
        int n = sc.nextInt();
        boolean f = false;
        if (n==1)
        {
            System.out.println("Number is prime");
        }
        else if (n==0)
        {
            System.out.println("Number is Co-prime");
        }
        else
        {
            for(i=2;i<(n/2);i++)
            {
                if(n%i==0)
                {
                    f = true;
                    break;
                }
            }
            if(f)
            {
                System.out.println("Number is not a prime number");
            }
            else
            {
                System.out.println("Number is a prime number");
            }
        }
    }
}