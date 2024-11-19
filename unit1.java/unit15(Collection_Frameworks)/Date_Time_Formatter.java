import java.time.*;
import java.time.format.DateTimeFormatter;
public class Date_Time_Formatter{
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dt2 = dt.format(dtf);
        System.out.println(dt2);
    }
}