class D1
{
    public int a =10;
    protected int b = 20;
    int c = 30;
    private int d = 40; 
}

class D2 extends D1
{
    void math()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //System.out.println(d); // cannot access private modifier inside subclass or inherited class
    }
}

public class D
{
    public static void main(String[] args)
    {
        D2 v = new D2();
        v.math();
    }
}