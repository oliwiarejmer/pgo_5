package zadanie1;

public class Test {

    public static void main(String [] args){

        Ksiazka ksiazka = new Ksiazka("ksiazka",123,"twoja_ksiażka",2020,991);
        Czasopismo czasopismo = new Czasopismo("czasopismo",11,"najlepsze",2010,33);
        Katalog katalog = new Katalog();


        katalog.dodajPozycje(ksiazka);
        katalog.dodajPozycje(czasopismo);

        System.out.println("znalezione "+katalog.znajdzPozycje(ksiazka));
        System.out.println("nie znalezione: " + katalog.znajdzPozycje(new Ksiazka()));

        katalog.wypiszWszystkiePozycje();
        ksiazka.dodajAutora(new Autor("Steven","King"));

        ksiazka.wypiszInfo();
        czasopismo.wypiszInfo();


    }
}
