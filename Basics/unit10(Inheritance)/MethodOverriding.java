class A
{
    void m1()
    {
        System.out.println("I am a method 1 of class A");
    }

    void m2()
    {
        System.out.println("I am a method 2 of class A");
    }
}

class B extends A
{
    @Override
    void m2()  // Overriding m2 with class A
    {
        System.out.println("I am a method 2 of class B");
    }

    void m3()
    {
        System.out.println("I am a method 3 of class B");
    }
}

public class MethodOverriding
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        obj1.m2();

        B obj2 = new B();
        obj2.m2();


    }
}