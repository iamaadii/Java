public class Q5
{
    public static void main(String[] args)
    {
        int n=5;
        for(int row=1;row<2*n;row++)
        {
            if(row<=n)
            {
                for(int col=1;col<=row;col++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

            else
            {
                for(int l=1;l<=2*n-row;l++) 
                {                              
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}