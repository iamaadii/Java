public class Square
{
    int side;

    public static void main(String[] args)
    {
        Square a = new Square();
        a.s(5);
        System.out.println("Area : " + a.area());
        System.out.println("perimeter : " + a.perimeter());
    }

    void s(int n)
    {
        side = n;
    }

    int area()
    {
        return side*side;
    }

    int perimeter()
    {
        return 4*side;
    }

}