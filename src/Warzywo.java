public abstract class Warzywo extends ProduktSpozywczy {
    Warzywo(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    public abstract void smak();
    public abstract void umyj();
    public abstract void zjedz();
}
