import java.util.Scanner;
class SpaceAndCharacter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid String!");
        String str = scan.nextLine();
        int ch = 0 , space = 0;
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)==32)
            space++;
            else
            ch++;
        }
        System.out.print("Total Space = "+space);
        System.out.print("Total Character = "+ch);
        
    }
}