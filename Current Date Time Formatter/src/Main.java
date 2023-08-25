import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Date Time Formatter:");
        LocalDateTime obj1=LocalDateTime.now();
        DateTimeFormatter obj2= DateTimeFormatter.ofPattern("E,dd-mm-yyyy hh:mm:ss");
        String fobj= obj1.format(obj2);
        System.out.println(fobj);
    }
}