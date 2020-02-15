package zajecia4;

import java.util.Arrays;
import java.util.Random;

/*Napisz program, który:
• stworzy tablicę (macierz) 5 x 5 liczb całkowitych,
• wypełnij ją losowymi wartościami z zakresu {−5, −4, . . . , 5},
• dla każdego wiersza wyznacz minimum,
• dla każdego wiersza wyznaczy maksimum,
• dla każdej kolumny wyznacz minimum,
• dla każdej kolumny wyznaczy maksimum.
Program ma wyświetlać tablicę wypełnioną liczbami oraz tablice z minimami oraz
maksymami*/

public class Zadanie3 {
    public static void main(String[] args) {
        int[][] macierz = new int[5][5];

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
        System.out.println();

        int[] maxWWierszach = new int[macierz.length];
        for (int i = 0; i < macierz.length; i++) {
            maxWWierszach = macierz[i][0];
                if(macierz[i][0]> maxWWierszach)
                    maxWWierszach = macierz[i][0];
            System.out.print(maxWWierszach + ", ");
            }
            System.out.println();
    }
}
