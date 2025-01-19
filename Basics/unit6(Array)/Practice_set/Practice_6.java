// for reversing a given array
public class Practice_6
{
    public static void main(String[] args)
    {
        int a[] = {23,45,67,89,78};
        int n = a.length;
        int mid = n/2;

        for(int i = 0;i<mid;i++)
        {
            int temp = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = temp;
        }

        for(int element : a)
        {
            System.out.print(element+" ");
        }
   }
}