public class Q6
{
    public static void main(String[] args)
    {
        int n=5;

        for(int row=1;row<n*2;row++)
        {
            if(row<=n)
            {
                for(int spaces=1;spaces<=n-row;spaces++)
                {
                    System.out.print(" ");
                }
                for(int col=1;col<=row;col++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int spaces=1;spaces<=row-n;spaces++)
                {
                    System.out.print(" ");
                }
                for(int l=1;l<=2*n-row;l++) 
                {                              
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}