package zajecia2;

import java.util.Arrays;

public class LoopIntro {
    public static void main(String[] args) {
        //prosta pętla while wypisująca wartości od 0 do 9
        int wiek = 20;
        System.out.println(wiek);

        //Sposób 1: Zwiększenie wartości zmiennej
        wiek = wiek + 5;
        System.out.println(wiek);

        /*Sposób 2:
        wiek += 7;

        Sposób 3: Jeżeli chcemy zmienić zmienną o 1 to mamy dwie drogi:
        wiek += 1; lub wiek++;

        Sposób 4: post- i pre- inkrementacja*/
        System.out.println("Pre vs post inkrementacja");
        System.out.println("Postinkrementacja");
        int liczba = 0;
        System.out.println(liczba++); //1 vs 0 ?? "najpierw wyświetla aktualną wartość zmiennej (0), a później ją zwiększa o 1"
        System.out.println(liczba); // 1

        System.out.println("Preinkrementacja: ++number");
        int number = 0;
        System.out.println(++number); //1 "zwiększ wartość o 1, a dopiero później wyświetlaj"
        System.out.println(number); // 1

        //pętla wypisująca liczby od 0 do 9
        System.out.println("Pętla WHILE");
        int licznik = 0;
        while (licznik < 10) {
            System.out.println(licznik++);
        }

        System.out.println("Pętla do while");
        int x = 0;
        do {
            System.out.print(x++);
            System.out.print(", ");
        } while (x < 10);
        }
    }
