package zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Ksiazka extends Pozycja
{

    public List<Autor> autors = new ArrayList<>();

    private int liczbaStron;

    public int getLiczbaStron(){
        return liczbaStron;
    }
    public void setLiczbaStron(int liczbaStron){
        this.liczbaStron=liczbaStron;
    }

    Ksiazka(){

    }
    Ksiazka(String tytul, int id, String wydawnictwo, int rokWydania, int liczbaStron){

        super(tytul, id, wydawnictwo, rokWydania);
        this.liczbaStron=liczbaStron;

    }

    public void dodajAutora(Autor autor){

        autors.add(autor);

    }

    public List<Autor> getAutors() {

        return autors;
    }

    @Override
    public void wypiszInfo() {
        if(getAutors().isEmpty())throw new IllegalArgumentException("zadanie1.Ksiazka musi miec przyjamniej jednego autora");
        System.out.println("Tytuł: " + this.tytul + " wydawnictwo: " + this.wydawnictwo  + " rokWydania: " + this.rokWydania + " liczba stron: "
                + this.liczbaStron + " autor/s "+getAutors());

    }

    public String toString(){
        return "Książka :: " + this.tytul + " wydawnictwo: " + this.wydawnictwo + " rok wydania: " + this.rokWydania + " liczba stron: " + this.liczbaStron;
    }

}
