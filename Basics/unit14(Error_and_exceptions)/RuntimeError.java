// User fix these type of errors

import java.util.Scanner;
public class RuntimeError
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = s.nextInt();
        System.out.println("100 divided by "+a+" : "+100/a);

    }
}