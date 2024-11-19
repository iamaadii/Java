// It is mutable
import java.util.Date;
public class Date1
{
    public static void main(String[] args)
    {
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis()/1000/60/60/24/365); // it will give the years after 1970
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getTime());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
    }
}