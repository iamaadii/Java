public class Q8
{
    public static void main(String[] args)
    {
        int n=4;
        for(int row=1;row<n*2;row++)
        {
            if(row<=n)
            {
                for(int space=1;space<=n-row;space++)
                {
                    System.out.print(" ");
                }
                for(int col=row;col>=1;col--)
                {
                    System.out.print(col);
                }
                for(int col=2;col<=row;col++)
                {
                    System.out.print(col);
                }
                System.out.println();
            }
            else
            {
                for(int space=1;space<=row-n;space++)
                {
                    System.out.print(" ");
                }
                for(int col=2*n-row;col>=1;col--)
                {
                    System.out.print(col);
                }
                for(int col=2;col<=2*n-row;col++)
                {
                    System.out.print(col);
                }
                System.out.println();
            }
        }
    }
}