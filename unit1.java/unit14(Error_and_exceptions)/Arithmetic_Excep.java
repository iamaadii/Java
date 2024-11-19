public class Arithmetic_Excep
{
    public static void main(String[] args)
    {
        int a = 1000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        }catch(Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}