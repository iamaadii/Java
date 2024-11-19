// Calendar class is an abstract class but we can create instance of it by using static method that is getInstance()..

import java.util.Calendar;
public class Calendar1{
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());

        System.out.println(c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));      
        
    }
}