import java.util.Arrays;

public class WyrazeniaRegularne {

    //Zadanie: podzielić poniższe zdanie na tablice z wyrazami.
    // "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale."

    public static void main(String[] args) {
        String regex = "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale.";
        String[] words = regex.split("[ .,:]+"); //split - dzielić, rozdzielać
        System.out.println(words.length + "|" + Arrays.toString(words));

        String newZdanie = regex.replaceAll("a", "@"); //zastępowanie a @
        System.out.println(newZdanie);
    }
}
