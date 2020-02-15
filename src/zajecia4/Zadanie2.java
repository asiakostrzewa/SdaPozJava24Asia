package zajecia4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    /*Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10,
    a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza
    się w tablicy.*/
    public static void main(String[] args) {
        /*losowanie liczb - generowanie liczb losowych
        Random rand = new Random();

        int losowaLiczba = rand.nextInt(10); //zakres: 0-9
        int losowaLiczba2 = rand.nextInt(10) + 1; //zakres: 0-10*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int arraySize = scanner.nextInt();

        /*tworzymy 2 tablice: 1 "liczby" - o rozmiarze podanym przez użytkownika,
        2 "wystąpienia" o rozmiarze 11 (dla zliczania wystąpień od 0 do 10)
         */

        int[] liczby = new int[arraySize];
        int[] wystapienia = new int[11];

        //wypełnij tablicę "liczby" wartościami losowymi

        Random r = new Random();

        for (int i=0; i<liczby.length; i++){
            //losujemy liczbę:
            int randomNumer = r.nextInt(10) + 1;
            //wpisujemy wylosowaną liczbę do tablicy
            liczby[i]=randomNumer;
        }

        //Mamy wypełnioną tablicę "liczby" więc ją wyświetlimy przy pomocy pętli "foreach":
        for (int liczba : liczby) {
            System.out.print(liczba + ", ");
        }
        System.out.println(); //'enter' - przejście do nowej linii

        //zliczanie elementów
        for (int i = 0; i < liczby.length; i++) {
            //pobierz wartość z tablicy "liczby". Wartość ta jest indeksem dla tablicy "wystąpienia"
            //Przykład: jeżeli będzie liczba 5 to w tablicy wystąpienia[5] należy implementować aktualną wartość

            int index = liczby[i];
            wystapienia[index]++;
        }

        //Wyświetlenie tablicy "wystąpienia"
        for (int i = 1; i < wystapienia.length; i++) {
            System.out.println(i + "--->" + wystapienia[i]);
        }

    }
}