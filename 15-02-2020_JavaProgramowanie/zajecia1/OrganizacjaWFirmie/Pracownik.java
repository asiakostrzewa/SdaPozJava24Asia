package OrganizacjaWFirmie;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private char plec;
    private int nr_dzialu;
    private float placa;
    private int wiek;
    private int dzieci;
    private boolean stan_cywilny;

    //metody:
    public void wypiszOkrojoneDane(int index) {
        String napis = "Index" + index + "|" + "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", placa=" + placa +
                '}';
        System.out.println(napis);
    }

    public void wypiszSpecjalneDane() {
        String napis = "Pracownik{" +
                "imie='" + imie.toUpperCase() + '\'' + //.toUpperCase pisane z wielkiej litery
                ", nazwisko='" + nazwisko.toUpperCase() + '\'' +
                '}';
        System.out.println(napis);
    }

    //sprawdzenie czy pensja jest powyżej podanej wartości // funkcja (zwraca true – powyżej, false – poniżej lub
    //równa) z parametrem, który oznacza pensję do porównania (float);

    public boolean czyPlacaJestPowyzejPodanejWartosci(float podanaWartosc){
        return placa > podanaWartosc; //jeśli podam że zarabiam 1000, a zarabiam 3000 - zwróci mi false
    }

    //to String() - bez parametrów:
    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                ", nr_dzialu=" + nr_dzialu +
                ", placa=" + placa +
                ", wiek=" + wiek +
                ", dzieci=" + dzieci +
                ", stan_cywilny=" + stan_cywilny +
                '}';
    }

    //Constructor
    public Pracownik(String imie, String nazwisko, char plec, int nr_dzialu, float placa, int wiek, int dzieci, boolean stan_cywilny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.nr_dzialu = nr_dzialu;
        this.placa = placa;
        this.wiek = wiek;
        this.dzieci = dzieci;
        this.stan_cywilny = stan_cywilny;
    }

    //Setter
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public void setNr_dzialu(int nr_dzialu) {
        this.nr_dzialu = nr_dzialu;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setDzieci(int dzieci) {
        this.dzieci = dzieci;
    }

    public void setStan_cywilny(boolean stan_cywilny) {
        this.stan_cywilny = stan_cywilny;
    }

}
