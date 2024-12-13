public class Bluza extends Ubranie{
    Bluza(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    @Override
    public void wypierz() {
        System.out.println("czysta jak nowa");
    }

    @Override
    public void zaloz() {
        System.out.println("Pasuje idealnie");
    }

    @Override
    public void wyprasuj() {
        System.out.println("bluza wyprasowana");
    }

    @Override
    public void wysusz() {
        System.out.println("bluza sucha");
    }

    @Override
    public void zniszcz() {
        System.out.println(":(");
    }
}
