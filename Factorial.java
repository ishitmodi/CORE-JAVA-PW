import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
int n=sc.nextInt();
int f=1,temp;
temp = n;
while(n>1)
{
f=f*n;
n--;
}
System.out.println("The factorial of:"+temp+"="+f);
}
}