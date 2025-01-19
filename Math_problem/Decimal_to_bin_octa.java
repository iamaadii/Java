import java.util.*;
public class Decimal_to_bin_octa
{

    public static String bin(int n)
    {
        if(n==0)
        {
            return "";
        }
        return bin(n/2)+(n%2);
        
    }

    public static void oct(int n)
    {
        if(n==0)
            return;
        else
        {
            oct(n/8);
            System.out.print(n%8);
        }
    }


    public static void main(String[] args)
    {
        String res = bin(10);
        System.out.println(res);
        oct(17);
    }
}