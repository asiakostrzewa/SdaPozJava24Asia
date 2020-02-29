public class Zad2 {
    public static void main(String[] args) {
        int [] tab = new int[]{1, 10, 100, -100};
        int a = tab[2]+tab[3]; // 100 i -100
        System.out.print(tab[a]); //0 ma 1 miejsce w tablicy
        System.out.println("A"+tab[tab[a]+1]); //tab[1+1] = 100 bo jest to 2 miejsce w tabeli
    }
}
/*
a 1A100
b 1A10
c 100A100
d 100A10
 */