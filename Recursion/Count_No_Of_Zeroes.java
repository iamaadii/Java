public class Count_No_Of_Zeroes
{
    public static int countZeroes(int n,int count)
    {
        if(n==0)
            return count;

        int m=n/10;
        int r=n%10;
        
        if(r==0)
            return countZeroes(m,count+1);
        else
            return countZeroes(m,count);
    }

    public static void main(String[] args)
    {
        int r = countZeroes(2040,0);
        System.out.print(r);
    }
}