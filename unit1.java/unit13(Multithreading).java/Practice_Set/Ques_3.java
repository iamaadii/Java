// Practice q.3,q.4,q.5
class Thread1 extends Thread
{
    @Override
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

class Thread2 extends Thread
{
    @Override
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

public class Ques_3
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority()); // by default priority is 5
        System.out.println(t2.getPriority());

        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());

    }
}