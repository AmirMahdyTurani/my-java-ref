import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class MathClass {
    public static void main(String[] args) {
        int max = Math.max(1,2);
        int min = Math.min(1,2);
        var sqrt = Math.sqrt(64);
        var abs = Math.abs(-10);
        var abs1 = Math.abs(10);
        var a = Math.random() * 10; // a number of 0 to 10
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        LocalDateTime dateTimeNow = LocalDateTime.now();
        var year = dateNow.getYear();
        ArrayList<String> strArrList = new ArrayList<String>();
        strArrList.add("This is a sample string...");
        System.out.println("just for Break Point");
    }
}
