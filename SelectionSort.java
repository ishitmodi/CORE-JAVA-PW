class SelectionSort
{
    public static void main(String args[])
    {
        int a[] = {50,30,40,20,10};
        int i,j,temp;
        for(i=0;i<(a.length-1);i++)
        {
            for(j=(i+1);j<a.length;j++)
            {
                temp = 0;
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted elements in a given array are:");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}