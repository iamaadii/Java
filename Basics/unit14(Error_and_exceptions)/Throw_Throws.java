class NegativeRadiusException extends Exception
{
    public String toString()
    {
        return "Radius cannot be negative";
    }
    public String getMessage()
    {
        return "Radius cannot be negative";
    }
}

public class Throw_Throws
{
    public static double area(int r) throws NegativeRadiusException
    {
        if (r < 0)
            throw new NegativeRadiusException();
        else
            return Math.PI*r*r;
    }

    public static int divide(int a,int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }

    public static void main(String[] args)
    {
        try {
            int result = divide(10, 2);
            System.out.println(result);
            double ar = area(-1);
            System.out.println(ar);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
    }
}