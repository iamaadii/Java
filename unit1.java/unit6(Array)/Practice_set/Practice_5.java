// for finding min and max element from an array

public class Practice_5
{
    public static void main(String[] args)
    {
        int a[] = {10,45,20,8,7};
        int min = a[0];
        int max = a[0];

        for(int n : a)
        {
            if(n<min)
                min = n;
        }

        for(int n : a)
        {
            if(n>max)
                max = n;
        }
        
        System.out.println("Minimum : "+min);
        System.out.println("Maximum : "+max);
    }
}

