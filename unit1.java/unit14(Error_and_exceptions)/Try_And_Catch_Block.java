import java.util.Scanner;
public class Try_And_Catch_Block
{
    public static void main(String[] args)
    {
        int a = 100;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = s.nextInt();

        try{
            System.out.println("quotient : " + a/n);
        }
        catch(Exception e)
        {
            System.out.print("We failed to divide\nreason: ");
            System.out.println(e);
        }
        System.out.println("end of program");
    }
}