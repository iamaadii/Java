import java.util.*;
class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I am toString()";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}

public class Exception_Class
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();
        if(a<9)
        {
            try{
                throw new MyException();
            }
            catch(MyException e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); // for checking in which line we are getting error
                System.out.println("Finished");
            }
            System.out.println("Yes finished");
        }
    }
}