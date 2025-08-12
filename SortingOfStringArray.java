class SortingOfStringArray
{
    public static void main(String args[])
    {
        String str[] = {"Indore" , "Bhopal" , "Dhar" , "Ujjain" , "Bhindar" , "India" , "Asia" , "Bhind" , "Kedarnath"};
        String temp;
        for(int i=0 ; i<str.length ; i++)
        {
            for(int j=0 ; j<str.length ; j++)
            {
                if(str[i].compareTo(str[j])<0)
                {
                    temp = str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("Sorted String Array:");
        for(String s:str)
        {
            System.out.println(s);
        }
    }
}