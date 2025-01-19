// for calculating the sum of elements present in an array
public class Practice_1
{
    public static void main(String[] args)
    {
        float a[] = new float[5];
        a[0] = 12.5f;
        a[1] = 2.6f;
        a[2] = 1.5f;
        a[3] = 12.45f;
        a[4] = 34.5f;

        float sum = 0f;
        for(int i = 0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        System.out.println("sum : " + sum);
    }
}