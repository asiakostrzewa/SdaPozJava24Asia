package OrganizacjaWFirmie;

import java.util.Scanner;

public class Program {
    public void pokazGlowneMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Co chcesz zrobić?");
        System.out.println("1 - Lista wszystkich pracowników");
        System.out.println("2 - Dodaj nowego pracownika");
        System.out.println("3 - Eksport"); //Nie musi się nic zadziać
        System.out.println("4 - Usuwanie pracowników");
        System.out.println("5 - Edycja danych");
        System.out.println("6 - Dodatkowe funkcje");
        System.out.println("7 - Dodatkowe funkcje dla plików tekstowych");
        System.out.println("8 - Informacja o programie");
        System.out.println("9 - Własna nazwa pliku");
        System.out.println("e lub q - Zakończenie aplikacji");
        System.out.print("Wybór:");
    }
        //do obsługi menu
        public String pobierzAkcjeOdUzytkownika () {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            return line.toLowerCase(); //zwraca wartość niezależnie od dużych czy małych liter
        }
    }
