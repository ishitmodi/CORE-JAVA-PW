class StringOne
{
    public static void main(String[] args)
    {
        String str1 = new String ("Hello");
        String str2 = new String ("Hello");
        System.out.println(str1);
        System.out.println(str1.hashCode());
        System.out.println(str1.length());
        System.out.println("Hello");
        System.out.println("Hello".hashCode());
        System.out.println("Hello".length());
        if(str1==str2)
        System.out.println("Same");
        else
        System.out.println("Not Same");
        if(str1.equals(str2))
        System.out.println("Same");
        else
        System.out.println("Not Same");
        if(str1.equalsIgnoreCase(str2))
        System.out.println("Same");
        else
        System.out.println("Not Same");
        int x = str1.compareTo(str2);
        System.out.println(x);
        int y = str1.compareToIgnoreCase(str2);
        System.out.println(y);
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
    }
}