public class Multiplication_Table
{
    public static void main(String[] args)
    {
        System.out.println("table : ");
        table(5);
    }

    static void table(int n)
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(n + "x" + i + "=" + n*i);
        }
    }
}