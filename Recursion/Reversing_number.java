public class Reversing_number
{
    public static void main(String[] args)
    {
       reverse(4329);
    }

    public static void reverse(int n)
    {
        int m=n/10;
        int r=n%10;

        if(m==0)
            System.out.print(r);
        else
        {
            System.out.print(r);
            reverse(m);
        }
    }
}