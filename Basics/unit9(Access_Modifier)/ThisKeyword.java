class C
{
    C(int a,int b)
    {
        this(a);
        System.out.println("value of b : " + b);
    }

    C(int a)
    {
        System.out.println("value of a : " + a);
    }
}

public class ThisKeyword
{
    public static void main(String[] args)
    {
        C c = new C(10,20);
    }
}