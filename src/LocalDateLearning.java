import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateLearning {
    public static void main(String[] args) {
        // CURRENT Date
        LocalDate localDate = LocalDate.now();
        System.out.println("Date : "+ localDate);
        // CURRENT Time
        LocalTime localTime = LocalTime.now();
        System.out.println("Time :"+localTime);

        // CURRENT Date and Time
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("Date&Time: "+localDateTime);

        //FUTURE DATE
        LocalDate localDate1 = localDate.plusDays(7);
        System.out.println("New Date: "+localDate1);

        // SUBTRACTING TWO HRS FROM CURRENT TIME
        LocalTime localTime1 = localTime.minusHours(2);
        System.out.println("Time after subtracted "+localTime1);

        // FORMATTING DATE&TIME
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = localDate.format(dateTimeFormatter);
        System.out.println("Updated format: "+ format);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // Current date and time with time zone
        System.out.println("Current date and time with time zone: " + zonedDateTime);

        // GIVING USER VALUE TO DATE
        LocalDate birthDate = LocalDate.of(1999, 6, 30);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);
        System.out.println("Age :"+age.getYears()+" Years"+age.getMonths()+" Months");
    }
}
