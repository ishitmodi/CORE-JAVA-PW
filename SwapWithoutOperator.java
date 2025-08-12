class SwapWithoutOperator
{
    public static void main(String args[])
    {
        int x=10,y=20;
        
        System.out.println("Before Swapping\nX = "+x+"\nY ="+y);
        
        x = x^y;
        y = x^y;
        x = y^x;
        
        System.out.println("After Swapping\nX = "+x+"\nY ="+y);
    }
}