package zajecia2;

import java.util.Scanner;

public class Podatek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój roczny dochód w PLN");
        final double PROG_PODATKOWY = 85_528;
        double dochod = scanner.nextDouble();
        double podatek = 0;

        if (dochod < PROG_PODATKOWY) {
            podatek = dochod * 0.18 - 556.02;
        } else {
            podatek = (dochod - PROG_PODATKOWY)*0.32 + 14_839.02;
        }
        System.out.println("Twój podatek wynosi " + podatek + " PLN");
    }
}
