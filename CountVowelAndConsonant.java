import java.util.Scanner;
class CountVowelAndConsonant
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid String!");
        String str = scan.nextLine();
        int vowel = 0 , space = 0 , consonant = 0;
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            vowel++;
            else if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            vowel++;
            else if(str.charAt(i)>='a' || str.charAt(i)<='z' || str.charAt(i)>='A' || str.charAt(i)<='Z')
            consonant++;
            else if(str.charAt(i) == 32)
            space++;
        }
        System.out.println("Total Space = "+space);
        System.out.println("Total Vowel = "+vowel);
        System.out.println("Total Consonant = "+consonant);
        
    }
}