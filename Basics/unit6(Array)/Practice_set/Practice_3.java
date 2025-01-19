// for calculating avg marks from an containing marks of all students
public class Practice_3
{
    public static void main(String[] args)
    {
        int a[] = {10,52,85};
        int sum = 0;
        for(int n : a)
        {
           sum = sum + n;
        }
        int avg = sum / a.length;
        System.out.println("avg : " + avg);
    }
}