public class Agrest extends Owoc{

    Agrest(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    @Override
    public void smak() {
        System.out.println("Smakuje calkiem dobrze");
    }

    @Override
    public void umyj() {
        System.out.println("Agrest umyty");
    }

    @Override
    public void zjedz() {
        System.out.println("Agrest zjedzony");
    }
}
