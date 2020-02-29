public class Zad4 {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < 5; i++){
            if(i/3==0){ //wyrażenia po przecinku od 0 są traktowane jako całość 0 / system zaokrągla liczby do całości
                System.out.println(i);
            }
        }
    }
}
/*
a 012345
b 01234
c 3
d 012
 */
