package zajecia2;

import java.util.Scanner;

public class sprzedazRatalna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cenę towaru od 100 zł do 10 tyś. zł");
        double cena = scanner.nextDouble();
        System.out.println("Podaj liczbę rat od 6 do 48");
        double liczba_rat = scanner.nextDouble();
        if ((cena >= 100 && cena <= 10_000) && (liczba_rat >= 6 && liczba_rat <= 48)) {
                double miesieczna_rata = 0;
                if (liczba_rat <= 12) {
                    System.out.println("Obliczona miesięczna rata wraz z odsetkami wynosi " + (miesieczna_rata = 1.025 * cena / liczba_rat) + " PLN");
                } else if (liczba_rat <= 24) {
                    System.out.println("Obliczona miesięczna rata wraz z odsetkami wynosi " + (miesieczna_rata = 1.05 * cena / liczba_rat) + " PLN");
                } else if (liczba_rat <= 48) {
                    System.out.println("Obliczona miesięczna rata wraz z odsetkami wynosi " + (miesieczna_rata = 1.1 * cena / liczba_rat) + " PLN");
                }
        } else {
            System.out.println("Podana cena lub liczba rat wykracza poza zakres. Wprowadź dane ponownie.");
        }
    }
}