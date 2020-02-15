package zajecia1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        double stopnieCelsjusza = 0;

        System.out.println("Podaj wartość temperatury w stopniach Celsjusza: ");
        stopnieCelsjusza = czytnik.nextDouble();

        System.out.println("Podana wartość wynosi " + (1.8 * stopnieCelsjusza + 32.0) + " stopni Fahrenheita.");

        double stopnieFahrenheita = 0;

        System.out.println("Podaj wartość temperatury w stopniach Fahrenheita: ");
        stopnieFahrenheita = czytnik.nextDouble();

        System.out.println("Podana wartość wynosi " + (stopnieFahrenheita - 32.0)/1.8 + " stopni Celsjusza.");

    }
}
