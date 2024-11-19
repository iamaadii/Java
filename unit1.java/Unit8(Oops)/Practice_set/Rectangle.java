public class Rectangle
{
    int length;
    int breadth;

    public static void main(String[] args)
    {
        Rectangle a = new Rectangle();
        a.length = 5;
        a.breadth = 3;
        System.out.println("Area : " + a.area());
        System.out.println("perimeter : " + a.perimeter());
    }

    int area()
    {
        return length*breadth;
    }

    int perimeter()
    {
        return 2*(length+breadth);
    }

}