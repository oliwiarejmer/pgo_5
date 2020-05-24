package zadanie2;

public abstract class Osoba {
    protected String imie;
    protected String nazwisko;

    public String getImie(){
        return imie;

    }
    public String getNazwisko(){
        return nazwisko;
    }

    Osoba(){

    }
    Osoba(String imie, String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }


}
