package zajecia1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class BMI_calculator {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        double masa = 0;
        double wzrost = 0;

        System.out.println("Podaj masę ciała w [kg]: ");
        masa = czytnik.nextDouble();

        System.out.println("Podaj wzrost w [m]: ");
        wzrost = czytnik.nextDouble();

        double BMI = 0;
        BMI = masa / Math.pow(wzrost, 2);
        // Wersja bez Math.pow: BMI = masa / (wzrost * wzrost);

        System.out.println("Twoje BMI wynosi: " + BMI);

        /* < 18,5 – niedowaga
        18,5 - 24,99 - waga OK
        25,0 – 29,99 - nadwaga
        30 < - otyłość */

        /*if (BMI > 18.5 && BMI < 25) {
            System.out.println("Wynik dobry, waga w normie");
        } else {
            System.out.println("Wynik zły, waga za duża lub za mała");
        } */

        if (BMI < 18.5) {
            System.out.println("Waga zbyt niska");
        } else if (BMI < 25){
            System.out.println("Waga OK");
        } else if (BMI < 30){
            System.out.println("Nadwaga");
        } else {
            System.out.println("Jesteś ludzikiem Michelin");
        }

        System.out.println("Koniec programu.");

    }
}
