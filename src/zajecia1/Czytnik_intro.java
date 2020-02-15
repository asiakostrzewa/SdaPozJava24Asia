package zajecia1;

import java.util.Scanner;

public class Czytnik_intro {
    public static void main(String[] args) {
        //aby móc czytać dane od użytkownika - musimy utworzyć obiekt typu Scanner wg następującej składni:
        Scanner czytnik = new Scanner(System.in);
        //czytnik to zmienna/obiekt typu Scanner

       String imie;
        //wiek to zmienna typu int. Jeśli zakładamy double to przechodzi wiek z przecinkiem, ale już nie z kropką
        double wiek = 0;
        //zakładamy 0, ponieważ w momencie pisania kodu nie wiemy ile konretny użytkownik ma lat
        double waga = 65.55;

        System.out.println("Podaj swoje imie: ");
        imie = czytnik.nextLine();

        //System.out.println("Podaj swoje imie: ");
        //imie = czytnik.next();

        System.out.println("Ile masz lat? ");
        wiek = czytnik.nextDouble();

        System.out.println("Witaj " + imie + "! Masz " + wiek + " lat.");
    }
}
