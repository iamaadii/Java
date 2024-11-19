interface TvRemote
{
    void button();
}

interface SmartTvRemote extends TvRemote
{
    void touch();
}

class Tv implements TvRemote
{
    public void button()
    {
        System.out.println("clicking button...");
    }
}

public class Q6
{
    public static void main(String[] args)
    {
        Tv a = new Tv();
        a.button();
    }
}