public class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        System.out.print("sum : "+ sum(5));
    }

    static int sum(int n)
    {
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
        
    }
}