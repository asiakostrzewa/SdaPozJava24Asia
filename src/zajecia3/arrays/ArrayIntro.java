package zajecia3.arrays;

import java.util.Scanner;

// http://www.jkozak.pl/przedmioty/java/zadania3.pdf
public class ArrayIntro {
    public static void main(String[] args) {
        int wiek = 10;

        String imie = "Piotr";

        // tworzenie tablicy 10-elementowej
        int[] liczby = new int[10];

        // wpisywanie wartosci do tablicy
        liczby[0] = 25;
        liczby[4] = 100;

        //pobieranie wartosci z tablicy
        int wartosc = liczby[4];

        System.out.println(wartosc);
        System.out.println(liczby[0]);

        // ArrayIndexOutOfBoundsException
        // Błędne użycia:
        // System.out.println(liczby[-2]); indeks tablicy NIGDY nie będzie ujemny!
        // System.out.println(liczby[15]); // jesli index wiekszy od długości tablicy to też błąd

        // Sprawdzanie długości tablicy
        int dlugoscTablicy = liczby.length;
        System.out.println("Tablica ma długość: " + dlugoscTablicy);


        String[] imiona = {"Ala", "Piotr", "Adam", "Karolina", "Eliza"};
        System.out.println("Długość tablicy to: " + imiona.length);

        // wyswietlenie wszystkich elementow tablicy

        for (int i = 0; i < imiona.length; i++) {
            String name = imiona[i];
            System.out.println("Imie nr. " + i + " to: " + name);
        }
        // alternatywnie:
        // od razu wyświetlenie elementu, bez wczesniejszego tworzenia zmiennej
//      System.out.println("Imie nr. " + i + " to: " + imiona[i]);

        // Dynamiczne tworzenie tablicy
        System.out.println("Podaj rozmiar tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int rozmiar = scanner.nextInt();

        int[] dynamicznaTablica = new int[rozmiar];

        System.out.println("Rozmiar dynamicznej tablicy: " + dynamicznaTablica.length);


    }
}