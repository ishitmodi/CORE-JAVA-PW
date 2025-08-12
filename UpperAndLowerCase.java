class UpperAndLowerCase
{
    public static void main(String[] args)
    {
        char ch;
        String str = new String("Hello Indore");
        for(int i=0 ; i<str.length() ; i++)
        {
            ch = str.charAt(i);
            if(ch>=97 && ch<=122)
            {
                System.out.print((char)(ch-32));
            }
            else
            {
                System.out.print(ch);
            }
        }
        System.out.println("");
        for(int i=0 ; i<str.length() ; i++)
        {
            ch = str.charAt(i);
            if(ch>=65 && ch<=90)
            {
                System.out.print((char)(ch+32));
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}