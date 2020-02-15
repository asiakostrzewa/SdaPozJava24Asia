import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class Zad5_TabliceIPetle {
    public static void main(String[] args) {

        /*Napisz program, który oblicza sumę liczb cyfry tj. dla liczby 52 suma jej pojedynczych cyfr
wynosi ‘5’ + ‘2’ -> ‘7’. Podpowiedź: Użyj metody split na obiekcie typu String*/

        Scanner scanner = new Scanner(System.in);
        String liczba = "5555";
        int suma = 0;
        for (int i=0; i<liczba.length(); i++) {
            char c = liczba.charAt(i);
            String wartosc = String.valueOf(c);
            suma = suma + Integer.valueOf(wartosc);
        }

        System.out.println("Suma liczb cyfry " + liczba + " to: " + suma);
    }
}
