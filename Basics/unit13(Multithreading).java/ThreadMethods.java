class MyTh1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<5)
        {
            System.out.println("Thread 1 is running");
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            i++;
        }
    }
}

class MyTh2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<5)
        {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}

public class ThreadMethods
{
    public static void main(String[] args)
    {
        MyTh1 t1 = new MyTh1();
        MyTh2 t2 = new MyTh2();
        
        t1.start();

        // try
        // {
        //     t1.join(); // for executing thread2 after the completion of thread1 
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }

        t2.start();
    }
}