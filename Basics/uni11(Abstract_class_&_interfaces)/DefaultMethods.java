interface Camera
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good morning");
    }
    default void record4kvideo()
    {
        greet();
        System.out.println("recording video in 4k");
    }
}

interface Wifi
{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class Cellphone
{
    void callNumber()
    {
        System.out.println("Calling ");
    }
    void pickCall()
    {
        System.out.println("Connecting...");
    }

}

class Smartphone extends Cellphone implements Wifi,Camera
{
    public void takeSnap()
    {
        System.out.println("Taking a snap");
    }
    public void recordVideo()
    {
        System.out.println("Recording a video");
    }
    //@Override
    // public void record4kvideo()
    // {
    //     System.out.println("taking snap and recording video in 4k");
    // }

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

}

public class DefaultMethods
{
    public static void main(String[] args)
    {
        Smartphone s = new Smartphone();
        s.takeSnap();
        s.recordVideo();
        //s.greet(); // cannot access private members in interface
        s.record4kvideo();

        String[] ar = s.getNetworks() ;
        for(String item : ar)
        {
            System.out.println(item);
        }
        s.connectToNetwork("harry");

        s.callNumber();
        s.pickCall();
    }
}