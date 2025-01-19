public class AverageOfSetOfNumbers
{
    public static void main(String[] args)
    {
        System.out.print("avg : " + avg(2,4,6,7));
    }

    static int avg(int...arr)
    {
        int sum = 0;
        for(int i:arr)
            sum = sum+i;
        return sum/arr.length;
    }
}