package zajecia3.jkozak;
// zadania ze strony:
// http://www.jkozak.pl/przedmioty/java/zadania2.pdf

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj dowonlna liczbę: ");

        int liczba = czytnik.nextInt();

        for (int i = 1; i <= liczba; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        // wersja alternatywna:
//    for (int i = 1; i <= liczba; i += 2) {
//      System.out.println(i);
//    }

    }
}