public class Zad5_TabliceIPetle {
    public static void main(String[] args) {

        /*Napisz program, który oblicza sumę liczb cyfry tj. dla liczby 52 suma jej pojedynczych cyfr
wynosi ‘5’ + ‘2’ -> ‘7’. Podpowiedź: Użyj metody split na obiekcie typu String*/

        String liczba = "5555";
        int suma = 0;
        for (int i=0; i<liczba.length(); i++) {
            char c = liczba.charAt(i);
            String wartosc = String.valueOf(c);
            suma = suma + Integer.valueOf(wartosc);
        }

        System.out.println("Suma liczb cyfry " + liczba + " to: " + suma);

        String alfabet = "abcdefg";
        /*z ASCII table*/
        int suma1 = 0;
        for (int i=0; i < alfabet.length(); i++) {
            int kod = alfabet.charAt(i);
            System.out.println(kod);
        }
    }
}