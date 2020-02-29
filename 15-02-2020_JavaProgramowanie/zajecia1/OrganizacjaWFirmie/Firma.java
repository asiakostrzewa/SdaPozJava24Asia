package OrganizacjaWFirmie;

import java.awt.*;
import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {
        Program menu = new Program();
        ListaPracownikow listaPracownikow = new ListaPracownikow();
        String akcja = "";
        while (!akcja.equals("e") && !akcja.equals("q")) { //dopóki akcja = e, w przeciwnym razie wychodzi z programu
            menu.pokazGlowneMenu();
            akcja = menu.pobierzAkcjeOdUzytkownika();

            switch (akcja) { //Switch Case = przełączanie wykonywania kodu aplikacji na różne tory w zależności od zaistniałej sytuacji lub całkowite pominięcie.
                case "1":           //jeżeli wciśniemy 1 to ma wyświetlić pracowników
                    listaPracownikow.wypiszWszystkichPracownikow();
                    break;
                case "2":           //dodaj użytkownika
                    listaPracownikow.dodajNowegoPracownika();
                    break;          //bo w przeciwnym wypadku przejdzie przez wszystkie opcje. Przykład dla e i q
                case "3":
                    System.out.println("Oto Twój Eksport File :)");
                    break;
                case "4":
                    listaPracownikow.wypiszWszystkichPracownikow();
                    listaPracownikow.usunPracownika();
                    break;
                case "e":
                case "q":
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Błędna akcja");
            }
        }
    }

    /*

        while (linia )
    ListaPracownikow listaPracownikow = new ListaPracownikow();
        ListaPracownikow.addPracownik();*/
}