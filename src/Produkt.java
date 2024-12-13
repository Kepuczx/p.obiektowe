import java.util.Objects;

public class Produkt implements IProdukt{
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    Produkt(String nazwa, double cena, int iloscNaMagazynie)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    /*
    @Override
    public String getClass()
    {
        return "Cześć jestem klasą "+this.getClass();
    }
    */

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(cena, produkt.cena) == 0 && Objects.equals(nazwa, produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }

    @Override
    public String toString()
    {
        return "nazwa: "+ nazwa +"\n" + "cena: "+ cena+"\n" + "ilosc na magazynie: "+iloscNaMagazynie;
    }

    @Override
    public void dodajDoMagazynu(int ilosc)
    {
        iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc)
    {
        if(iloscNaMagazynie >= ilosc)
        {
            iloscNaMagazynie -= ilosc;
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa == null || nazwa.trim().isEmpty())
            throw new IllegalArgumentException();
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if(cena < 0.0)
            throw new IllegalArgumentException();
        this.cena = cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        if(iloscNaMagazynie < 0)
            throw new IllegalArgumentException();
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
}