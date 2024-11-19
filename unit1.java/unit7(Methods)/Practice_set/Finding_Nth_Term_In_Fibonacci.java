public class Finding_Nth_Term_In_Fibonacci
{
    public static void main(String[] args)
    {
        System.out.print("value : "+fib(5));
    } 

    static int fib(int n)
    {
        if(n==1 || n==2)
            return n-1;
        else
            return fib(n-1) + fib(n-2);
    }
}