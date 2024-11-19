abstract class Pen
{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen
{
    void changeNib()
    {
        System.out.println("change nib");
    }
    void write()
    {
        System.out.println("write");
    }
    void refill()
    {
        System.out.println("refil");
    }
}

public class Q1
{
    public static void main(String[] args)
    {
        FountainPen p = new FountainPen();
        p.write();
        p.refill();
        p.changeNib();
    }
}