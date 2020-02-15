package zajecia2;

import java.util.Scanner;

public class WhileLoopParzyste {

    public static void main(String[] args) {
        //Wersja1
        System.out.println("Liczby parzyste od 0 do 100 - wersja 1 - pętla for");
        for (int i = 1; i <=100; i++) {
            if ((i%2 == 0)) {
                System.out.print(i + ", ");
            }
        }
        //Wersja2
        System.out.println();
        System.out.println("Liczby parzyste od 0 do 100 - wersja 2 - pętla for");
        for (int i = 0; i <=100; i += 2) {
                System.out.print(i + ", ");
        }

        //Wypisać liczby nieparzyste 0 - 100 w odwrotnej kolejności
        System.out.println();
        System.out.println("Liczby nieparzyste od 0 do 100 - wersja 1 - pętla for");
        for (int i = 99; i >= 0; i -= 2) {
            System.out.print(i + ", ");
        }

        //Suma liczb od 0 do 100;
        System.out.println();
        System.out.println("Suma liczb od 0 do 100");
        int suma = 0;
        for (int i = 0; i <= 100; i++) {
            suma += i;
            //alternatywnie: suma = suma + i;
        }
        System.out.println("Suma to: " + suma);
    }

}
