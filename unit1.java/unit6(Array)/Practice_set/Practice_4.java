// for adding two matrix of size 2 * 3
public class Practice_4
{
    public static void main(String[] args)
    {
        int i,j;
        int a[][] = { {1,2,3},{4,5,6}};
        int b[][] = { {2,7,8},{7,2,4}};
        int c[][] = new int[2][3];
        
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("after adding : ");
        for(i=0;i<c.length;i++)
        {
            for(j=0;j<c[i].length;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }

    }
}