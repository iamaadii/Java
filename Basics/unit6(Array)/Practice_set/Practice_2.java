// for checking given number is present in the array or not
import java.util.Scanner;
public class Practice_2
{
    public static void main(String[] args)
    {
        int i;
        int a[] = {10,52,85};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value which u want to search : ");
        int n = s.nextInt();
        for(i = 0;i<a.length;i++)
        {
            if(a[i]  == n){
                System.out.println("found");
                break;
            }
        }
        if(i==n)
          System.out.println("not found");  
    }
}