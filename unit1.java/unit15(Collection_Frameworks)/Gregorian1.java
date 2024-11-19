// Gregorian class ia an concreate class and subclass of calendar class

import java.util.GregorianCalendar;
public class Gregorian1{
    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2025));
    }
}