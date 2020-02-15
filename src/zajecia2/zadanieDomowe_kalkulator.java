package zajecia2;

import java.util.Scanner;

public class zadanieDomowe_kalkulator {
    public static void main(String[] args) {
        System.out.println("Witaj użytkowniku! Właśnie rozpoczynasz swoje pierwsze działąnia matematyczne! Poniższy program ma służyć do realizacji funkcji kalkulatora prostego, pozwalającego na wykonywanie operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych 'a' i 'b'." +
                "Pamiętaj o zastosowaniu symbolu '.' zamiast ',' oraz o tym, że nie wolno dzielić przez zero!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wartość a");
        double a = scanner.nextDouble();
        System.out.println("Wprowadź symbol +, -, * lub /");
        double symbol = scanner.nextDouble();
        System.out.println("Wartość b");
        double b = scanner.nextDouble();


//        double wynik = a symbol b;
//        System.out.println("Wynik to " + wynik);

    }
}
    /* Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji
       dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych.
       Program ma identyfikować sytuację wprowadzenia błędnego
       symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch
       do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu
       operacji. Scenariusz działania programu:
        a) Program wyświetla informację o swoim przeznaczeniu.
        b) Wczytuje pierwszą liczbę.
        c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
        d) Wczytuje drugą liczbę.
        e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.
        f) Program kończy swoje działanie po naciśnięciu przez użytkownika klawisza
        Enter. */