import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int r,temp,sum=0;
        int n = sc.nextInt();
        temp = n;
        while(n!=0)
        {
            r = n%10;
            sum = sum+(r*r*r);
            n = n/10;
        }
        if(sum == temp)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
    }
}