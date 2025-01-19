public class Rectangle
{
    private int l;
    int b;

    Rectangle(int l,int b)
    {
        this.l = l;
        this.b = b;
    }

    Rectangle()
    {
        this.l = 4;
        this.b = 5;
    }

    int getLength()
    {
        return l;
    }

    int getBreadth()
    {
        return b;
    }

    public static void main(String[] args)
    {
        Rectangle r2 = new Rectangle();
        System.out.println("Length : " + r2.getLength());
        System.out.println("Breadth : " + r2.getBreadth());       

        Rectangle r1 = new Rectangle(5, 10);
        System.out.println("Length : " + r1.getLength());
        System.out.println("Breadth : " + r1.getBreadth());

    }
}