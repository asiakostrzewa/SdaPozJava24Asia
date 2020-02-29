public class Zad3 {
    public static void main(String[] args) {
        int[] tab = {3,3,3,3};
        if(tab.length>5)
            System.out.println("3");
        System.out.println("33");
//domyślnie wykonywana jest tylko pierwsza instrukcja dla warunku if, tak jak u góry
        if (tab.length > 5) {
            System.out.print("3");
        }
        System.out.print("33");
//klamry
        if (tab.length > 5) {
            System.out.print("3");
            System.out.print("33");
        } //nic się nie wyświetla
    }
}
/*
a 333
b 3333
c 33
d 3
 */

