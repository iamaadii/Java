class Phone
{
    void greet()
    {
        System.out.println("Good morning");
    }

    void name()
    {
        System.out.println("From phone class");
    }
}

class Smartphone extends Phone
{
    void swagat()
    {
        System.out.println("Aapka swagat hai");
    }

    @Override
    void name()
    {
        System.out.println("From Smartphone class");
    }
}

public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        Phone p = new Smartphone();  // we can say a smartphone as phone that why it is correct
        p.greet();
        //p.swagat(); // it will give an error because given function is not present inside phone class
        p.name();
        //Smartphone s = new Phone(); // we cannot say a normal phone as smartphone that why it will show an error
    }
}