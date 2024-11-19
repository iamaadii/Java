interface Sample
{
    void meth1();
    void meth2();
}

interface Child extends Sample
{
    void meth3();
    void meth4();
}

class SampleClass implements Child
{
    public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2");
    }
    public void meth3()
    {
        System.out.println("meth3");
    }
    public void meth4()
    {
        System.out.println("meth4");
    }
}

public class InheritanceInInterface
{
    public static void main(String[] args)
    {
        SampleClass s = new SampleClass();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}