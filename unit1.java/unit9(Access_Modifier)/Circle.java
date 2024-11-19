class crcl
{
    private int radius;

    void setRadius(int r)
    {
        radius =  r;
    }

    double getArea()
    {
        return 3.14*radius*radius;
    }

    double getPerimeter()
    {
        return 2*3.14*radius;
    }
}

public class Circle
{
    public static void main(String[] args)
    {
        crcl c = new crcl();
        c.setRadius(5);
        System.out.println("area : " + c.getArea());
        System.out.println("perimeter : " + c.getPerimeter());
    }
}