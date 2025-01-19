public class Recursion{

    public static void main(String[] args)
    {
        System.out.println("factorial : "  + factorial(5));
        System.out.println("factorial : "  + fact(5));
    }

    static int factorial(int n)
    {
        if(n==0 || n==1)
            return 1;
        
        else
            return n*factorial(n-1);
    }

    static int fact(int n)
    {
        if(n == 0 || n==1)
            return 1;

        else
        {
            int fact = 1;
            for(int i=1;i<=n;i++)
            {
                fact = fact*i;
            }
            return fact;
        }
    }
}