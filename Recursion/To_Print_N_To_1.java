public class To_Print_N_To_1
{
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) 
    {
        if(n<=0)
            return ;
        else
        {
            print(n-1);
            System.out.println(n);
        }
    }
}