package zajecia3.arrays;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

        // tworzymy nową tablicę:
        int[] array = new int[size];

        // wypełnij w pętli for tablicę
        // np.
        // "Podaj 1 element tablicy"
        // "Podaj 2 element tablicy"
        // ...
        // "Podaj n-ty element tablicy"
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + " element tablicy: ");
            int liczba = scanner.nextInt();
            array[i] = liczba;

            // alternatywnie:
//      array[i] = scanner.nextInt();
        }

        // wyświetl elementy tablicy....
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }

        // oblicz min, max, avg, itd

        //min
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Najmniejsza wartość to: " + min);

        // max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max > array[i]) {
                // aktualny max wiekszy od i-tego elementu, wiec nic nie robimy
                // kontynuujemy pętlę i zaczynamy nowy obieg pętli
                continue;
            }
            // podmiana max
            max = array[i];
        }

        System.out.println("Najwieksza wartosc to: " + max);

        // avg

        int suma = 0;
        float avg = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        avg = (float) suma / array.length;
        System.out.println("Srednia to: " + avg);
    }
}