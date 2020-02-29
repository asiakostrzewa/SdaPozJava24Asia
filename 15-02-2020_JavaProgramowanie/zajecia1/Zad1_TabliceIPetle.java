import java.util.Random;
import java.util.Scanner;

/*
Zadania Tablice i pętle
1. Napisz program symulujący grę w Lotto:
a. Użytkownik typuje 6 cyfr
b. Program losuje 6 cyfr z liczb od 1 do 49
c. Program wypisuje na ekranie wytypowane przez użytkownika cyfry
d. Program wypisuje na ekranie wylosowane cyfry
e. Program wyświetla wynik użytkownika w poniższej formie:
    Trafiono n z 6 cyfr
f. *Upewnij się że użytkownik podaje 6 różnych liczb
g. *Upewnij się, że maszyna losująca generuje 6 różnych liczb
h. ! Skorzystaj z klasy java.util.Random
 */

public class Zad1_TabliceIPetle {
    public static void main(String[] args) {
        System.out.println("Podaj 6 cyfr z zakresu 1 - 49. Liczba 1:");
        Scanner scanner = new Scanner(System.in);
        int[] li = new int[6]; //definicja wielkości tablicy
        li[0] = scanner.nextInt();
        System.out.println("liczba 2: ");
        li[1] = scanner.nextInt();
        System.out.println("liczba 3: ");
        li[2] = scanner.nextInt();
        System.out.println("liczba 4: ");
        li[3] = scanner.nextInt();
        System.out.println("liczba 5: ");
        li[4] = scanner.nextInt();
        System.out.println("liczba 6: ");
        li[5] = scanner.nextInt();

        System.out.println("Wytypowane przez Ciebie liczby to: "+li[0]+", "+li[1]+", "+li[2]+", "+li[3]+", "+li[4]+", "+li[5]);

        Random r = new Random();
        int[] wylosowaneLiczby = new int[6];
        wylosowaneLiczby[0] = r.nextInt(49)+1;
        wylosowaneLiczby[1] = r.nextInt(49)+1;
        wylosowaneLiczby[2] = r.nextInt(49)+1;
        wylosowaneLiczby[3] = r.nextInt(49)+1;
        wylosowaneLiczby[4] = r.nextInt(49)+1;
        wylosowaneLiczby[5] = r.nextInt(49)+1;
        System.out.print("Wylosowane liczby to: Liczba 1: "+ wylosowaneLiczby[0]);
        System.out.print(", liczba 2: "+ wylosowaneLiczby[1]);
        System.out.print(", liczba 3: "+ wylosowaneLiczby[2]);
        System.out.print(", liczba 4: "+ wylosowaneLiczby[3]);
        System.out.print(", liczba 5: "+ wylosowaneLiczby[4]);
        System.out.print(", liczba 6: "+ wylosowaneLiczby[5]);

        int suma = 0;
        for (int i = 0; i <li.length; i++){
            for (int j = 0; j < wylosowaneLiczby.length; j++){
                suma++;
            }
        }
        System.out.println("");
        System.out.println("Trafiono "+ suma + " z 6 cyfr");
    }
}