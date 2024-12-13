public class Pomidor extends Warzywo{
    Pomidor(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    @Override
    public void smak() {
        System.out.println("Smakuje ponadprzecietnie!");
    }

    @Override
    public void umyj() {
        System.out.println("Pomidor sie swieci");
    }

    @Override
    public void zjedz() {
        System.out.println("Pomidor zjedzony jak jablko");
    }
}
