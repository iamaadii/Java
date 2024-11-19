class Cylinder
{
    float radius;
    float height;

    void setRadius(int r)
    {
        this.radius = r;
    }

    void setHeight(int h)
    {
        this.height = h;
    }

    double volume()
    {
        return Math.PI*radius*radius*height;
    }

    double area()
    {
        return 2*3.142*radius*height + 2*3.1422*radius*radius;
    }

    public static void main(String[] args)
    {
        Cylinder c = new Cylinder();
        c.setHeight(10);
        c.setRadius(5);
        System.out.println("Volume of Cylinder: " + c.volume());
        System.out.println("Surface area of Cylinder: " + c.area());
    }
}