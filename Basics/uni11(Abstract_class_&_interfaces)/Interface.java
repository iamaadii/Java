interface Bicycle
{
    int n = 10; // by default it's a constant value we cannot change it
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface BlowHorn
{
    void blowHorn();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,BlowHorn
{
    public void applyBrake(int decrement) 
    {
        //n = n-decrement; // cannot modify the properties in interfaces as they are final
        System.out.println("Applying brake");
    }

    public void speedUp(int increment)
    {
        //n = n + increment; // cannot modify the properties in interfaces as they are final
        System.out.println("Applying speedup");
    }

    public void blowHorn()
    {
        System.out.println("Blowing horn");
    }

    public void blowHornmhn()
    {
        System.out.println("Mai hu na po po po");
    }

}

public class Interface
{
    public static void main(String[] args)
    {
        //Bicycle b = new Bicycle(); // cannot create object of interface class
        AvonCycle a = new AvonCycle();
        a.applyBrake(1);
        a.speedUp(1);
        System.out.println(a.n);
        //a.n = 452; // cannot modify the properties in interfaces as they are final
        a.blowHorn();
        a.blowHornmhn();
    }
}