import java.time.*;
import java.util.Arrays;
import java.util.TimeZone;

public class Czas {
    public static void main(String[] args) {
        System.out.println("Instant");
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.parse("2020-02-29T08:33:15.350416500Z"); //parse podaje czas z tekstu
        instant1 = instant1.minus(Duration.ofDays(05));
        System.out.println(instant1);

        Instant instant2 = instant1.plus(Duration.ofHours(8));
        System.out.println(instant2);

        boolean check = instant1.isBefore(instant2);
        System.out.println(check);

        System.out.println("LocalDate");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specialDay = LocalDate.of(2022, 3, 11);
        LocalDate specialDay2 = LocalDate.of(2020, Month.FEBRUARY, 15);

        String myBirthday = "1996-05-13";
        LocalDate myBirthdayLocalDate = LocalDate.parse(myBirthday);

        LocalDate tomorrow = LocalDate.now().plusDays(1);

        System.out.println("LocalTime");
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime meeting = LocalTime.of(11,30,0);
        LocalTime meetingFinish = meeting.plusHours(3);

        System.out.println(meetingFinish.isAfter(meeting));

        System.out.println("ZonedDateTime");
        String[] ids = TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(ids)); //wyświetla dostępne strefy czasowe
    }
}
