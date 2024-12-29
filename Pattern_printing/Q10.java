public class Q10
{
    public static void main(String[] args)
    {
        int n=5;
        for(int row=1;row<=n;row++)
        {
            if(row==n)
            {
                for(int col=1;col<2*n;col++)
                    System.out.print("*");
                System.out.println();
            }
            else
            {
                for(int col=1;col<2*n;col++)
                {
                    if(col==n-row+1 || col==n+row-1)  
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}