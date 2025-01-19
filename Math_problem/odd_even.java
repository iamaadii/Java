public class odd_even
{
    public static void number(int n)
    {
        if((n&1)==1)
            System.out.print("Odd\n");
        else
            System.out.print("even\n");   
    }

    public static void main(String[] args)
    {
        number(5);
        number(18);
    }
}