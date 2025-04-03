import java .time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-YYYY HH:mm:ss");
       String formatted = myObj.format(formatter);
        System.out.println(formatted);


    }
}
