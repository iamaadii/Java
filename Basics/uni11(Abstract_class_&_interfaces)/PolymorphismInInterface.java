interface Camera1
{
    void takeSnap();
    void recordVideo();
}

interface Wifi1
{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class Cellphone1
{
    void callNumber(long number)
    {
        System.out.println("Calling " + number);
    }
    void pickCall()
    {
        System.out.println("Connecting...");
    }
}

class Smartphone1 extends Cellphone1 implements Wifi1,Camera1
{
    public void takeSnap()
    {
        System.out.println("Taking a snap");
    }
    public void recordVideo()
    {
        System.out.println("Recording a video");
    }

    public String[] getNetworks()
    {
        System.out.println("Getting list of networks : ");
        String[] networkList = {"harry","prasanth"};
        return networkList;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connecting to " + network);
    }
    public void math()
    {
        System.out.println("math");
    }

}

public class PolymorphismInInterface
{
    public static void main(String[] args)
    {
        //Here we are creating a refrence variable of interface camera with the help of smartphone for that we can only access the properties of Camera
        Camera1 c = new Smartphone1();

        //c.getNetworks(); // not allowed
        //c.connectToNetwork("harry"); // not allowed
        //c.math(); // not allowed

        c.takeSnap();
        c.recordVideo();

        Smartphone1 s = new Smartphone1();
        s.callNumber(878054374);
        s.pickCall();
    }
}