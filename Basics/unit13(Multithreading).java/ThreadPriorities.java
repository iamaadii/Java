class Th1 extends Thread
{
    public Th1(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while(i<2)
        {
            System.out.println("Thankyou : "+ getName());
            i++;
        }
    }
}

public class ThreadPriorities
{
    public static void main(String[] args)
    {
        Th1 t1 = new Th1("Harry1");
        Th1 t2 = new Th1("Harry2");
        Th1 t3 = new Th1("Harry3");
        Th1 t4 = new Th1("Harry4(most important)");
        t4.setPriority(Thread.MAX_PRIORITY); // 0r t4.setPriority(10);
        t1.setPriority(Thread.MIN_PRIORITY); // 0r t3.setPriority(1);
        t2.setPriority(Thread.MIN_PRIORITY); // 0r t2.setPriority(1);
        t3.setPriority(Thread.MIN_PRIORITY); // 0r t1.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}