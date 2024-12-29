public class Q11
{
    public static void main(String[] args)
    {
        int n=6;
        for(int row=1;row<2*n;row++)
        {
            if(row<=n)
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
            else
            {
                for(int col=1;col<2*n;col++)
                {
                    if(col==row-n+1 || col==2*n-row+n-1)  
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}