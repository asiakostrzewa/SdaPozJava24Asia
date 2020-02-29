import java.util.Scanner;

public class Zas13_TabliceIPetle {
    public static void main(String[] args) {
        //choinka a
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość choinki 1: ");
        int wysokosc = scanner.nextInt();

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //choinka b
        System.out.println("Podaj wysokość choinki 2: ");
        int wysokosc2 = scanner.nextInt();
        for (int i = 0; i < wysokosc2; i++) {
            for (int j = 0; j < wysokosc2 - i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //choinka c
        System.out.println("Podaj wysokość choinki 3: ");
        int wysokosc3 = scanner.nextInt();
        for (int i = 0; i < wysokosc3; i++) {
            for (int j = 0; j < wysokosc3; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //choinka d
        System.out.println("Podaj wysokość choinki 4: ");
        int wysokosc4 = scanner.nextInt();
        for (int i = 0; i < wysokosc4+1; i++) {
            for (int j = 0; j < wysokosc4; j++) {
                if (j >= wysokosc4 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}