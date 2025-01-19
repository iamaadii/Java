// Accesing access modifier in same package

class C1
{
    public int a =10;
    protected int b = 20;
    int c = 30;
    private int d = 40; 
}

public class C
{
    public static void main(String[] args)
    {
        C1 v = new C1();
        System.out.println(v.a);
        System.out.println(v.b);
        System.out.println(v.c);
        System.out.println(v.d); //cannot access private member inside same package or we can say from outside the class
    }
}