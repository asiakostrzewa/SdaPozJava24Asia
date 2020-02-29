package OrganizacjaWFirmie;

import java.util.Scanner;

public class ListaPracownikow {
    private Pracownik[] listaPracownikow = new Pracownik[100];
    private int licznikPracownikow = 0;

    public ListaPracownikow() {
        Pracownik pracownik1 = new Pracownik("Asia", "Kostrzewa", 'K', 1, 3000, 23, 0, false);
        listaPracownikow[licznikPracownikow++] = pracownik1;
        Pracownik pracownik2 = new Pracownik("Monika", "DziewczynaRatownika", 'K', 1, 4000, 26, 2, false);
        listaPracownikow[licznikPracownikow++] = pracownik2;
    }

    public void dodajNowegoPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię pracownika: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj plec pracownika: K - kobieta, M - mężczyzna ");
        char plec = scanner.nextLine().charAt(0);
        System.out.println("Podaj numer dzialu pracownika: ");
        //int nr_dzialu = scanner.nextInt();
        int nr_dzialu = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj płacę pracownika: ");
        float placa = scanner.nextFloat();
        System.out.println("Podaj wiek pracownika: ");
        int wiek = scanner.nextInt();
        System.out.println("Podaj liczbę dzieci pracownika: ");
        int dzieci = scanner.nextInt();
        System.out.println("Podaj stan cywilny pracownika: true - mężatka/żonaty");
        boolean stan_cywilny = scanner.nextBoolean();

        Pracownik nowyPracownik = new Pracownik(imie, nazwisko, plec, nr_dzialu, placa, wiek, dzieci, stan_cywilny);
        listaPracownikow[licznikPracownikow++] = nowyPracownik;
    }

    public void usunPracownika() {
        int ileMamyPracownikow = ileMamyPracownikow();
        if (ileMamyPracownikow > 0) {
            int index = pobierzIndexPracownika();
            listaPracownikow[index] = null;
            System.out.println("Usunięto pracownika");
        }
        else {
            System.out.println("Masz pustą listę pracowników");
        }
    }

    private int ileMamyPracownikow() {
        int suma = 0;
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow != null){
                suma++;
            }
        }
        return suma;
    }

    private int pobierzIndexPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj index pracownika do usunięcia: ");
        int index = Integer.parseInt(scanner.nextLine());
        return index;
    }

    public void wypiszWszystkichPracownikow(){
           for (int i = 0; i < listaPracownikow.length ; i++) {
               if (listaPracownikow[i] != null){
                   listaPracownikow[i].wypiszOkrojoneDane(i);
               }
           }
       }

    }