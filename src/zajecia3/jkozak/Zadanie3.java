package zajecia3.jkozak;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = sc.nextInt();

        // I rozwiazanie
        for (int i = 0; Math.pow(2, i) <= n; i++) {
            System.out.print(Math.pow(2, i) + ", ");
        }

        // II rozwiazanie
        System.out.println("\n2 Rozwiazanie: ");
        for (int i = 1; i <= n; i = i * 2) {
            System.out.print(i + ", ");
        }

    }
}