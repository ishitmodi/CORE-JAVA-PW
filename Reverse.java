import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int reverse;
        int number = sc.nextInt();
        while(number!=0)
        {
            reverse = number%10;
            System.out.print(reverse);
            number = number/10;
        }
    }
}