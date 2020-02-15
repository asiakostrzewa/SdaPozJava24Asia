package zajecia3;

import java.util.Scanner;

public class FibOld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fib1 = 1;
        int fib2 = 1;
        System.out.println("fib[1]: " + 1);
        System.out.println("fib[2]: " + 1);
        int suma = 0;
        for (int i = 3; i <= n; i++) {
            suma = fib1 + fib2;
            fib1 = fib2;
            fib2 = suma;
            System.out.println("fib[" + i + "] : " + suma);
        }
        System.out.println(n + "-ty wyraz ciagu to: " + suma);
    }
//  1,1,2,3,5, 7, 13
}