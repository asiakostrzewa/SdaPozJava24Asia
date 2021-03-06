import java.util.Arrays;
import java.util.Random;

public class Tablica {
    //Stworzyć tablicę z miejscem na 100 elementów. Wygenerować losowo do niej elementy z zakresu 10-30;
    //Zrobić histogram tych wartości, czyli policzyć na tablicach ile występuje elementów o danej wartości.
    // Histogram może być wypisany poziomo. Wyspisać to podobnie jak w zadaniu z gwiazdkami.

    /*public static void main(String[] args) {
        Random r = new Random();
        int[] zlicz = new int[21]; //bo w zakresie 10-30 jest 21 liczb
        int[] wylosowaneLiczby = new int[100];
        for (int i = 0; i < wylosowaneLiczby.length; i++) {  // row
            wylosowaneLiczby[i] = r.nextInt(21) + 10;
            System.out.print(i + 1 + ": ");
            //zlicz[wylosowaneLiczby[i] - 10]++;

            // Print value as the number of stars
            for (int starNo = 1; starNo <= wylosowaneLiczby[i]; starNo++) {  // column
                System.out.print("*");
            }
            System.out.println("[" + wylosowaneLiczby[i] + "]");

        }
    }*/

    public static void main(String[] args) {
        int[] tab = new int[100];
        Random random = new Random();
        int[] histogram = new int[21];
        for (int i=0; i < tab.length; i++){
            tab[i] = random.nextInt(21) + 10;
        }
        for (int value: tab) {
            histogram[value - 10]++;
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(histogram));
        for (int i = 0; i < histogram.length; i++) {
            System.out.print(i+10 + ": " + "*".repeat(histogram[i]));
            System.out.println("(" + histogram[i] + ")");
        }
    }
}
