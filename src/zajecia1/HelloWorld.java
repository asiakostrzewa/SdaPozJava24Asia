package zajecia1;

public class HelloWorld {

public static void main(String[] args){
    //komentarz
    System.out.print("Hello World! ");
    //ta linia kodu wypisuje komunikat bez przejścia do nowej linii
    System.out.println("Zajęcia SDA Javy");

    //deklaracja i inicjalizacja razem
    //TYP NAZWA_ZMIENNEJ = WARTOSC;
    byte malaLiczba=10;

    int wiek = 30;

    int duzaLiczba = 10024541;
long bardzoDuzaLiczba = 4_000_000_000_0L;
float pi = 3.14f;
    double numerPi = 3.14;

    boolean czyWPoznaniuCieplo = true;
    String imie = "Asia";

    System.out.println(malaLiczba);
    System.out.println(duzaLiczba);
    System.out.println(imie);

    imie = "Ala";
    System.out.println(imie);
}

}
