import java.util.Scanner;
class IndexOf
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid String!");
        String str = scan.nextLine();
        System.out.println(str.indexOf('h'));
        System.out.println(str.indexOf('h',5));
        System.out.println(str.indexOf("brother"));
        System.out.println(str.indexOf("brother",1));
    }
}