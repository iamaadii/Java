import java.util.Scanner;
public class HandlingSpecificException
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a[] = {12,34,56,67};

        System.out.println("Enter index ");
        int index = s.nextInt();

        System.out.println("Enter number from which you want to divide : ");
        int num = s.nextInt();

        try{
            System.out.println("Value of array index is : " + a[index]);
            System.out.println("quotient : " + a[index]/num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("arithmeticexception occured");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("arrayoutofboundsexception occured");
        }
        catch(Exception e)
        {
            System.out.println("Some other exception occured");
            System.out.println(e);
        }



    }
}