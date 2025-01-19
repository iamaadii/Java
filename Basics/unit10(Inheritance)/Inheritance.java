// single level inheritance

class Base
{
    private int x;

    void setX(int x)
    {
        this.x = x;
    }

    int getX()
    {
        return x;
    }
}

class Derived extends Base
{
    int y;

    void setY(int y)
    {
        this.y = y;
    }

    int getY()
    {
        return y;
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        Derived d = new Derived();
        d.setX(10);
        System.out.println("Value of x: " + d.getX());
        d.setY(20);
        System.out.println("Value of y: " + d.getY());

        Base b = new Base();
        b.setX(30);
        System.out.println("Value of x: " + b.getX());
        // b.setY(40);
        //System.out.println("Value of y: " + d.getY()); // gives an error bcoz y is not declared inside base class

    }
}