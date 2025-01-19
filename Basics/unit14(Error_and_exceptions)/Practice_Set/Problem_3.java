import java.util.*;
public class Problem_3
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30};
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while(i<5)
        {
            try{
                System.out.println("Enter the index : ");
                int index = sc.nextInt();
                System.out.println("Value : "+a[index]);
            }
            catch(Exception e)
            {
                System.out.println("Invalid Index");
                i++;
            }
        }
        System.out.println("ERROR");
    }
}