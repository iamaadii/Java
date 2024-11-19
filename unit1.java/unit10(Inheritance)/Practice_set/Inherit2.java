class Cube
{
    int length;

    void setLength(int length)
    {
        this.length = length;
    }
  
    int getLength()
    {
        return length;
    }

    double area()
    {
        return 6*length*length;
    }
}

class Cuboid extends Cube
{
    int breadth;
    int height;

    void dimension(int length,int breadth,int height)
    {
        setLength(length);
        this.breadth=breadth;
        this.height = height;
    }

    int getBreadth()
    {
        return breadth;
    }

    int getHeight()
    {
        return height;
    }

    double volume()
    {
        return length*breadth*height;
    }
}

public class Inherit2
{
    public static void main(String[] args)
    {
        Cuboid a = new Cuboid();
        a.dimension(5,6,7);
        System.out.println("length : "+ a.getLength());
        System.out.println("breadth : "+ a.getBreadth());
        System.out.println("height : "+ a.getHeight());
        System.out.println("Area of cube is: "+a.area());
        System.out.println("volume of cuboid is: "+a.volume());

    }
}