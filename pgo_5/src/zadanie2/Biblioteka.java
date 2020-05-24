package zadanie2;

import java.util.*;

public class Biblioteka implements IZarzadzaniePozycjami {

    private Katalog katalog = new Katalog();
    private Set<Bibliotekarz> bibliotekarze = new HashSet<>();
    private Set<Katalog> katalogi = new HashSet<>();
    private Map<String, Set<Pozycja>>  katalogMap = new HashMap<>();
    private String adres;

    public String getAdres(){
        return adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }

    Biblioteka(){

    }

    Biblioteka(String adres){
        this.adres=adres;

    }

    public void dodajBibliotekarza(Bibliotekarz bibliotekarz){
        bibliotekarze.add(bibliotekarz);
    }

    public void wypiszBibliotekarzy(){
        bibliotekarze.forEach(System.out::println);
    }

    public void dodajKatalog(Katalog katalog){
        katalogi.add(katalog);

    }
    public void wyswietlKatalogi(){
        katalogi.forEach(System.out::println);
    }
    public void dodajPozycje(Pozycja pozycja, String dzialTematyczny){

        katalog.dodajPozycje(pozycja);

        katalogMap.computeIfAbsent(dzialTematyczny, k -> new HashSet<>()).add(pozycja);

    }

    @Override
    public Optional<Pozycja> znajdzPozycjePoTytule(String tytul) {

        return katalog.wypiszWszystkiePozycje()
                      .stream()
                      .filter(t->t.getTytul().equals(tytul))
                      .findAny();

    }

    @Override
    public Optional<Pozycja> znajdzPozycjePoId(int id) {

        return katalog.wypiszWszystkiePozycje()
                      .stream()
                      .filter(i ->i.getId()==id)
                      .findFirst();
    }

    @Override
    public List<Pozycja> wypiszWszystkiePozycje() {
         return katalog.wypiszWszystkiePozycje();
    }

    public void displayMap( ){

        katalogMap.entrySet()
                  .forEach(System.out::println);

    }
    public void findSpec(String spec){

        if(katalogMap.containsKey(spec)) {
            katalogMap.get(spec).forEach(System.out::println);
        }else System.out.println("Nie znaleziono po wskazanym dziale tematycznym");
    }

}
