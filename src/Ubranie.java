public abstract class Ubranie extends ProduktPrzemyslowy{
    Ubranie(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    public abstract void wypierz();
    public abstract void zaloz();
    public abstract void wyprasuj();
    public abstract void wysusz();
    public abstract void zniszcz();
}
