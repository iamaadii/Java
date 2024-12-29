import java.util.*;
public class Q9
{
    public static void main(String[] args)
    {
        int n=4;
        for(int row=1;row<2*n;row++)
        {
            for(int col=1;col<2*n;col++)
            {
                int val = Math.min(Math.min(row,col),Math.min(2*n-row,2*n-col)) ;
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}