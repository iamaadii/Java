import Harry.gym.HarryGym;
class Using extends HarryGym
{
    void math1()
    {
        // We can only use public and protected modifier inside extended or subclass
        System.out.println(a); 
        System.out.println(b);
        //System.out.println(c);
        //System.out.println(d); 
    }
}
public class UsingPackage
{
    public static void main(String[] args)
    {
        System.out.println("I am using the packages");
        HarryGym v = new HarryGym();
        System.out.println(v.a); // We can only access public modifier from another package
        //System.out.println(v.b);
        //System.out.println(v.c);
        //System.out.println(v.d); 
        Using c = new Using();
        c.math1();
    }
}