package zajecia2;
//Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz najmniejszą z nich
import java.util.Scanner;

public class zadanieDomowe_liczbyCalkowite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 liczby całkowite. Liczba 1: ");
        int liczba1 = scanner.nextInt();
        System.out.println("liczba 2: ");
        int liczba2 = scanner.nextInt();
        System.out.println("liczba 3: ");
        int liczba3 = scanner.nextInt();

        System.out.println("Max. to " + Math.max(liczba1, Math.max(liczba2, liczba3)));
        System.out.println("Min. to " + Math.min(liczba1, Math.min(liczba2, liczba3)));
    }
}