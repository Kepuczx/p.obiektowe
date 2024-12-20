import java.util.HashMap;
import java.util.Objects;


public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa=nazwa;
        this.cena=cena;
        this.iloscNaMagazynie=iloscNaMagazynie;

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje(){
        System.out.println("Nazwa: "+this.nazwa+", cena: "+this.cena+", ilosc na Magazynie: "+this.iloscNaMagazynie);

    }
    public void dodajDoMagazynu(int ile){
        this.iloscNaMagazynie+=ile;
    }
    public void usunZMagazynu(int ile){
        if(this.iloscNaMagazynie < ile){
            return;
        }
        this.iloscNaMagazynie-=ile;
    }
    public void odejmij(int ile){
        this.iloscNaMagazynie-=ile;
    }
    public void dodaj(int ile){
        this.iloscNaMagazynie+=ile;
    }
    public String opis(){
        return "Cześć jestem klasą "+ this.getClass().getSimpleName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa,cena);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.cena, cena) == 0 && Objects.equals(nazwa, produkt.nazwa);
    }


}

