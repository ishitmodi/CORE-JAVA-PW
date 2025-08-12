import java.util.Scanner;
class Trim
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid String!");
        String str = scan.nextLine();
        System.out.println(str);
        System.out.println(str.trim());
    }
}