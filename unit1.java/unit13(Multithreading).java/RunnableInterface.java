class ThreadRunnable1 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class ThreadRunnable2 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}

public class RunnableInterface
{
    public static void main(String[] args)
    {
        ThreadRunnable1 bullet1 = new ThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        ThreadRunnable2 bullet2 = new ThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}