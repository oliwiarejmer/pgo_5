package zadanie1;

public class Autor
{

    private String imie;
    private String nazwisko;

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


    Autor(){

    }
    Autor(String imie, String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    public String toString(){
        return "imie: "+this.imie + " nazwisko: " + this.nazwisko;

    }

}
