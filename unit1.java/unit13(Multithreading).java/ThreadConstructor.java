class Th extends Thread
{
    public Th(String name)
    {
        super(name); // It will call the constructor of thread class 
    }
    public void run()
    {
        int i=0;
        while(i<=1)
        {
            System.out.println("Thread is running");
            i++;
        }
    }
}

public class ThreadConstructor
{
    public static void main(String[] args)
    {
        Th t = new Th("Harry");
        t.start();
        System.out.println("Id of thread t is " + t.getId());
        System.out.println("name of thread t is " + t.getName());


    }
}