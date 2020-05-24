package zadanie2;

public class Bibliotekarz extends Osoba {
    private String dataZatrudnienia;
    private double wynagrodzenie;

    public String getDataZatrudnienia(){
        return dataZatrudnienia;
    }
    public void setDataZatrudnienia(){
        this.dataZatrudnienia=dataZatrudnienia;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    Bibliotekarz(){

    }
    Bibliotekarz(String imie, String nazwisko, String dataZatrudnienia, double wynagrodzenie){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.dataZatrudnienia=dataZatrudnienia;
        this.wynagrodzenie=wynagrodzenie;
    }

    @Override
    public String toString (){
        return "Bibliotekarz :: "+"imie " + this.imie + " nazwisko " + this.nazwisko + " data zatrudnienia " + this.dataZatrudnienia + " wynagrodzenie: " + this.wynagrodzenie;
    }

}
