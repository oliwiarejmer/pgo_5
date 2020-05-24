package zadanie2;

public class TestZadanie2 {
    public static void main(String [] args)  {

        Ksiazka ksiazka = new Ksiazka("how to be awesome",99,"wydawnictwo ksiazkowe",2000, 1233);
        Czasopismo czasopismo = new Czasopismo("news",33,"onet",2020,1);
        ksiazka.dodajAutora(new Autor("Gal","Anonim","Polska"));
        ksiazka.dodajAutora(new Autor("Michael","Jordan","USA"));

        ksiazka.wypiszInfo();
        czasopismo.wypiszInfo();

        Bibliotekarz bibliotekarz = new Bibliotekarz("Kazik","Marek","2020-01-01",5000);
        Biblioteka biblioteka = new Biblioteka("Złota 44");
        Biblioteka biblioteka1 = new Biblioteka("Wspólna 111");

        biblioteka.dodajBibliotekarza(bibliotekarz);
        biblioteka.wypiszBibliotekarzy();


        Pozycja poz = new Czasopismo("Wiedza ABCD",1121,"abc",2020,4);

        Katalog katalog = new Katalog("Kulinarny");
        biblioteka.dodajKatalog(katalog);
        katalog.dodajPozycje(ksiazka);
        katalog.dodajPozycje(czasopismo);
        biblioteka.dodajPozycje(poz,"popularnonaukowy");
        Ksiazka k = new Ksiazka("Jak upolowac rysia?",111,"bbbb",1990,887);
        k.dodajAutora(new Autor("Autor","autorski","polsza"));
        biblioteka.dodajPozycje(new Czasopismo("Podróż na 6!",55,"AAA",2020,11),"podróże");
        biblioteka.dodajPozycje(k,"technologia");
        biblioteka.dodajKatalog(katalog);
        biblioteka.dodajPozycje(k,katalog.getDzialTematyczny());
        System.out.println(biblioteka.wypiszWszystkiePozycje());


        Biblioteka newBiblioteka = new Biblioteka("Daimlera 1");
        Katalog katal = new Katalog("Sportowy");
        Czasopismo c = new Czasopismo("Cosmo",123,"cosmo corp",2019,999);

        newBiblioteka.dodajKatalog(katalog);
        newBiblioteka.dodajKatalog(katal);
        newBiblioteka.wyswietlKatalogi();


        katal.dodajPozycje(c);

        newBiblioteka.dodajPozycje(katal.znajdzPozycje(c),katal.getDzialTematyczny());  //sportowy
        newBiblioteka.dodajPozycje(k,katal.getDzialTematyczny()); //sportowy

        newBiblioteka.dodajPozycje(c,katalog.getDzialTematyczny());


        newBiblioteka.displayMap();

        System.out.println("Znaleziona pozycja: " + katal.znajdzPozycje(c));
        System.out.println("Po ID: "+biblioteka.znajdzPozycjePoId(123));
        System.out.println("Po tytule: "+biblioteka.znajdzPozycjePoTytule("Jak upolowac rysia?"));
        System.out.println(biblioteka.znajdzPozycjePoTytule("tu nie znajdzie"));

        biblioteka.displayMap();


        System.out.println('\n'+"Znalezisko :: ");
        biblioteka.findSpec("Kulinarny");
        newBiblioteka.findSpec("Sportowy");

        biblioteka1.dodajPozycje(new Ksiazka("aaaa",123,"asdd",1991,333),"sport");
        biblioteka1.dodajPozycje(new Czasopismo("bbbbb",321,"lala",2020,444),"nauka");
        biblioteka1.dodajPozycje(new Czasopismo("",12123,"lalala",2000,555),"kultura");
        System.out.println("Wszystkie pozycje w bibliotece: " +'\n' + biblioteka.wypiszWszystkiePozycje());
        System.out.println("Wszystkie pozycje w bibliotece1: " +'\n' + biblioteka1.wypiszWszystkiePozycje());

        biblioteka1.displayMap();
    }
}
