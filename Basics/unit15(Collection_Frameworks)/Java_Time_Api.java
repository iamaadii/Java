// It is immutable
import java.time.*;
public class Java_Time_Api{
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println("Current Date: " + d);

        LocalTime t = LocalTime.now();
        System.out.println("Current Time: " + t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dt);
    }
}