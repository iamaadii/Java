public class Sum_And_Product_Of_Individual_Digit
{
    public static void main(String[] args)
    {
       System.out.println(sum(727));
       System.out.println(product(752));
    }

    public static int sum(int n)
    {
        int m=n/10;
        int r=n%10;

        if(m==0)
            return r;
        else
            return r+sum(m);
    }

    public static int product(int n)
    {
        int m=n/10;
        int r=n%10;

        if(m==0)
            return r;
        else
            return r*product(m);
    }

}