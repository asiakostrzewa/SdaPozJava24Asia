import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Przyklad58 {
    public static void main(String[] args) {
        System.out.println("Przykład 5.8c");
        ZonedDateTime dataCzas = ZonedDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy MM dd");
        String tekst = dataCzas.format(f);
        System.out.println(tekst);

        System.out.println("Przykład 5.8d");
        String tekst1 = "2018 05 03";

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate data = LocalDate.parse(tekst1, f1);

        System.out.println("Zadanie 5.6");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data2 = LocalDate.parse("2020-02-29", f2);

        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String tekst3 = data2.format(f3);
        System.out.println(tekst3);
    }
}
