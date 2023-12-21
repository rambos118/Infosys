import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FlightBooking {
    public static void main(String[] args) {
        // Assuming the flight time is in IST
        LocalDateTime departureTimeIST = LocalDateTime.of(2016, 11, 30, 21, 30, 0);
        LocalDateTime arrivalTimeIST = LocalDateTime.of(2016, 12, 1, 6, 0, 0);

        // Zone selected by the customer (e.g., "America/New_York")
        String selectedZone = "America/New_York";

        // Convert times to selected zone
        ZonedDateTime departureTimeSelectedZone = departureTimeIST.atZone(ZoneId.of(selectedZone));
        ZonedDateTime arrivalTimeSelectedZone = arrivalTimeIST.atZone(ZoneId.of(selectedZone));

        // Display the times
        displayFlightTimes(departureTimeSelectedZone, arrivalTimeSelectedZone);
    }

    private static void displayFlightTimes(ZonedDateTime departureTime, ZonedDateTime arrivalTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");

        System.out.println("Departure Time: " + departureTime.format(formatter));
        System.out.println("Arrival Time: " + arrivalTime.format(formatter));
    }
}
