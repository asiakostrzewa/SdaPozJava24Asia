public class Zad5 {
    public static void main(String[] args) {
        boolean flag = true;
        int i = 3;
        while (flag){
            i--; //najpierw pomniejsza o jeden
            System.out.print(i*2);
            if (i==0) flag = false;
        }
    }
}
/*
a 420
b 123
c 321
d 6420
 */