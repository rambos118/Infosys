import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeService {
    // lop --- method
    public static long calculateLOPs(String startDateLOP, String endDateLOP) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate start = LocalDate.parse(startDateLOP, formatter);
        LocalDate end = LocalDate.parse(endDateLOP, formatter);

        long lops = java.time.temporal.ChronoUnit.DAYS.between(start, end) + 1;
        return lops;
    }

    // Other fields and methods
}
