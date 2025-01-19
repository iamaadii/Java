public class find_unique
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,3,4,2,1,8};

        int unique = 0;
        for(int i:arr)
        {
            unique = unique^i;
        }
        System.out.println("Unique element is: "+unique);

    }
}