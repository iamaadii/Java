// accessing access modifier within the same class

class B1
{
    public int a =10;
    protected int b = 20;
    int c = 30;
    private int d = 40; 
    void math()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class B
{
    public static void main(String[] args)
    {
        B1 v = new B1();
        v.math();
    }
}