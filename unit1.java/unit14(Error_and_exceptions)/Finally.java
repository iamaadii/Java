// NOTE : we can also use finally without catch block.....

public class Finally
{
    public static int greet()
    {
        try{
            int a=10;
            int b = 0;
            return a/b;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("This is finally block");
        }
        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println(greet());
    }
}

