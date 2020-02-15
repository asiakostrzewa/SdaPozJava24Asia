package zajecia3;

import java.util.Scanner;

/*
  Napisać program zliczający długość łańcucha znakowego.
   - Z białymi znakami
   - Bez białych znaków
*/
public class Zadanie4 {
    public static void main(String[] args) {
        // zapytaj uzytkownika o dowolny napis
        // "Ala ma kota", "Piotr", "Zadanie4"
        // policz liczbę znaków (ze spacją i bez)
        // wyswietl wynik
        // np.  "Długość napisu ... ze spacjami wynosi: WYNIK,
        // "bez spacji ... "
        //
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj dowolny napis: ");
        String text = czytnik.nextLine();
        // zliczanie długości napisu bez spacji
        int licznik = 0;
        for (int i = 0; i < text.length(); i++) {
            // pobierz 1 znak
            char znak = text.charAt(i);
            System.out.println("Znak na pozycji: " + i + " to: " + znak);
            // jeżeli dany znak jest literą (czyli nie jest spacją), to go zliczamy
            if (znak != ' ') {
                licznik++;
            }
        }
        System.out.println("Długość tekstu (ze spacjami) to: " + text.length());
        System.out.println("Długość tekstu bez spacji to: " + licznik);

        // wyswietl napis zapisany małymi i duzymi literami
        System.out.println("Tekst małymi literami to: " + text.toLowerCase());
        System.out.println("Tekst dużymi literami to: " + text.toUpperCase());
    }
}