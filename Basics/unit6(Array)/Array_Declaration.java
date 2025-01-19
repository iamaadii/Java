public class Array_Declaration{
    public static void main(String[] args)
    {
        int []a = new int[2]; // declarartion + memory allocation
        a[0] = 18;
        a[1] = 34;
        a[1] = 45;
       // a[2] = 56; it will give error

        System.out.println(a[0]);
        System.out.println(a[1]);

    }
}
