import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDateGenerator {

    public static void main(String[] args) {
        // Define the start and end dates
        LocalDate startDate = LocalDate.of(2000, 1, 1); // Start date
        LocalDate endDate = LocalDate.of(2023, 12, 31); // End date
        
        // Generate a random date
        LocalDate randomDate = getRandomDate(startDate, endDate);
        
        // Format and display the random date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Random Date: " + randomDate.format(formatter));
    }

    private static LocalDate getRandomDate(LocalDate start, LocalDate end) {
        // Calculate random day between start and end dates
        long startEpochDay = start.toEpochDay();
        long endEpochDay = end.toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay + 1);
        return LocalDate.ofEpochDay(randomEpochDay);
    }
}
