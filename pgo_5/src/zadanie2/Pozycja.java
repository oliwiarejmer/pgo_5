package zadanie2;

public abstract class Pozycja {

    protected String tytul;
    protected int id;
    protected String wydawnictwo;
    protected int rokWydania;


    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }


    Pozycja() {

    }

    Pozycja(String tytul, int id, String wydawnictwo, int rokWydania) {
        this.tytul = tytul;
        this.id = id;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;


    }

    public abstract void wypiszInfo();

}