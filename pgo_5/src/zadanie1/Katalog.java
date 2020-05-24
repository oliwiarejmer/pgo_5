package zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Katalog {

    private String dzialTematyczny;
    private List<Pozycja> pozycjaSet = new ArrayList<>();
    private Pozycja pozycja = null;

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
    public void wypiszWszystkiePozycje(){
        pozycjaSet.forEach(System.out::println);
    }


}
