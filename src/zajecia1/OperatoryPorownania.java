package zajecia1;

public class OperatoryPorownania {
    public static void main(String[] args){
        int wiek = 18;

        //wersja1
        boolean czyPelnoletni = wiek >= 18;
        System.out.println("Czy wiek >= 18 ? " + czyPelnoletni);
        System.out.println("Czy wiek <= 18 ? " + (wiek <= 18));
        System.out.println("Czy wiek jest różny od 20 ? " + (wiek != 20));

        /*wersja2
        System.out.println(wiek == 18);
         */

    }
}
