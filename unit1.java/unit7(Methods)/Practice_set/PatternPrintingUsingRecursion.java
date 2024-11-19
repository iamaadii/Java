public class PatternPrintingUsingRecursion
{
    public static void main(String[] args)
    {
        System.out.println("Right angle triangle using recursion : ");
        patt(4);
        System.out.println();
        System.out.println("Inverted Right angle triangle using recursion : ");
        pattern(4);
    }

    static void patt(int n)
    {
        if(n>0)
        {
            patt(n-1);
            for(int i=1;i<=n;i++)
            {
                 System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern(int n)
    {
        if(n>0)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
            pattern(n-1);
        }
    }
}