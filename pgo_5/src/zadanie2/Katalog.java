package zadanie2;

import java.util.*;
import java.util.stream.Collectors;

public class Katalog implements IZarzadzaniePozycjami {

    private String dzialTematyczny;
    public   List<Pozycja> pozycjaSet = new ArrayList<>();


    public List<Pozycja> getPozycjaSet() {
        return pozycjaSet;
    }


    public String getDzialTematyczny(){
        return dzialTematyczny;
    }
    public void setDzialTematyczny(String dzialTematyczny){
        this.dzialTematyczny=dzialTematyczny;
    }

    Katalog(){

    }
    Katalog(String dzialTematyczny){
        this.dzialTematyczny=dzialTematyczny;

    }

    public void dodajPozycje(Pozycja pozycja){
        pozycjaSet.add(pozycja);
    }
    public Pozycja znajdzPozycje(Pozycja pozycja){
        if(pozycjaSet.stream().anyMatch(p -> p.equals(pozycja)))
        return pozycjaSet.stream().filter(p -> p.equals(pozycja)).collect(Collectors.toList()).get(0);
        else return null;

    }

    @Override
    public Optional<Pozycja> znajdzPozycjePoTytule(String tytul) {
        return pozycjaSet.stream().filter(t->t.getTytul().equals(tytul)).findFirst();
    }

    @Override
    public Optional<Pozycja> znajdzPozycjePoId(int id) {
        return pozycjaSet.stream().filter(i->i.getId()==id).findFirst();
    }
    public List<Pozycja> wypiszWszystkiePozycje(){
        return pozycjaSet;
    }


    public String toString(){
        return "" + this.dzialTematyczny;
    }

}
