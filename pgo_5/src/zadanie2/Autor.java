package zadanie2;

public class Autor extends Osoba
{

    private String imie;
    private String nazwisko;
    private String narodowosc;

    public String getImie(){
        return imie;
    }
    public void setImie(String imie){
        this.imie=imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;

    }
    public String getNarodowosc(){
        return narodowosc;
    }
    public void setNarodowosc(String narodowosc){
        this.narodowosc=narodowosc;
    }



    public Autor(){

    }
    public Autor(String imie, String nazwisko, String narodowosc){

        this.imie=imie;
        this.nazwisko=nazwisko;
        this.narodowosc=narodowosc;
    }

    @Override
    public String toString(){
        return "imie: "+getImie() + " nazwisko: " +getNazwisko() + " narodowosc: " + getNarodowosc();

    }

}
