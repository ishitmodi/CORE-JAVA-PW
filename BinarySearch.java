import java.util.Scanner;
class BinarySearch
{
public static void main(String args[])
{
int a[] = {10,20,30,40,50,60,70,80,90,100};
int low = 0 , high = (a.length-1) , mid;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a value to be searched");
int n = sc.nextInt();
boolean f=false;
while(low<=high)
{
mid = (low+high)/2;
if(a[mid]==n)
{
f = true;
System.out.println("Element found in the array.");
break;
}
else if(n>a[mid])
{
low = mid+1;
}
else
{
high = mid-1;
}
}
}
}