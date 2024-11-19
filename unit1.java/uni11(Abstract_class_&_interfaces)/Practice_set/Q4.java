abstract class TelePhone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone
{
    void ring()
    {
        System.out.println("ring");
    }
    void lift()
    {
        System.out.println("lift");
    }
    void disconnect()
    {
        System.out.println("disconnect");
    }
}


public class Q4
{
    public static void main(String[] args)
    {
        SmartTelephone telephone = new SmartTelephone();
        telephone.ring();
        telephone.lift();
        telephone.disconnect();
    }
}