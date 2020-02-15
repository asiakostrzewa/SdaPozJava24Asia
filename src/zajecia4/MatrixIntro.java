package zajecia4;

import java.util.Arrays;
import java.util.Random;

public class MatrixIntro {
    public static void main(String[] args) {
        int[][] macierz = new int[3][5];

        System.out.println(macierz.length); //zwraca liczbę wierszy
        System.out.println(macierz[0].length); //zwraca liczbę kolumn

        Random r = new Random();
        //wyświetlanie macierzy z wartościami losowymi
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                macierz[i][j] = r.nextInt(10);
            }
        }

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                System.out.print(macierz[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
