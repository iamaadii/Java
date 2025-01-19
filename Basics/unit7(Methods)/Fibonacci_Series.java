public class Fibonacci_Series
{
    public static void main(String[] args)
    {
        System.out.print("fibonacci series : ");
        for(int i =  1;i<=5;i++)
        {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n)
    {
        if(n == 1)
            return 0;
        else if(n == 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
}