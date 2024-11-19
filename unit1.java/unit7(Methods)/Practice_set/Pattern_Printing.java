public class Pattern_Printing
{
    public static void main(String[] args)
    {
        System.out.println("Right angle triange : ");
        for(int i = 0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Inverted Right angle triange : ");
        for(int i = 0;i<4;i++)
        {
            for(int j=i;j<4;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    
}