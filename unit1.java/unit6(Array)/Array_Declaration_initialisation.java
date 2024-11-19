public class Array_Declaration_initialisation{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40}; // declaration + initialization
        float b[] = {10.25f,52.56f};
        String c[] ={"aditya","sandeep","danish","rohit"};

        System.out.println("length : " + a.length);
        System.out.println(a[0]);

        System.out.println(b[1]);

        System.out.println(c.length);

        System.out.println("printing using for-each loop");
        for(int element : a)
           System.out.println(element);
        

    }
}