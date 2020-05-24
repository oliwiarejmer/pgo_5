package zadanie2;

public class Czasopismo extends Pozycja {


    private int numer;

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }


    Czasopismo(){

    }
    Czasopismo(String tytul, int id, String wydawnictwo, int rokWydania, int numer){
        super(tytul, id, wydawnictwo, rokWydania);
        this.numer=numer;
    }

    @Override
    public void wypiszInfo(){
        System.out.println("Tytuł: " + this.tytul + " wydawnictwo: " + this.wydawnictwo  + " rokWydania: " + this.rokWydania + " numer " + this.numer);
    }
    @Override
    public String toString(){
        return "Czasopismo :: " + this.tytul + " wydawnictwo: " + this.wydawnictwo + " rok wydania: " + this.rokWydania + " liczba stron: " + this.numer;
    }


}
