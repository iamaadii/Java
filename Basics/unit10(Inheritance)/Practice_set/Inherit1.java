class Circle
{
    int r;
    Circle(int r)
    {
        this.r = r;
    }
    double area()
    {
        return 3.14 * r * r;
    }

}

class Cylinder extends Circle
{
    int h;
    Cylinder(int r, int h)
    {
        super(r);
        this.h = h;
    }
    double volume()
    {
        return 3.14*r*r*h;
    }
}

public class Inherit1
{
    public static void main(String[] args) 
    {
        Cylinder c = new Cylinder(5, 10);
        System.out.println("Area of circle : " + c.area());;
        System.out.println("Volume of cylinder : " + c.volume());
    }
}