public class MP3 extends UrzadzenieElektroniczne{
    MP3(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    @Override
    public void napraw() {
        System.out.println("Znow moze grac muzyke");
    }

    @Override
    public void uzyj() {
        System.out.println("W trakcie sluchania");
    }

    @Override
    public void zepsuj() {
        System.out.println("halo, nic nie slychac");
    }

    @Override
    public void wlacz() {
        System.out.println("MP3 ON");
    }

    @Override
    public void wylacz() {
        System.out.println("MP3 OFF");
    }
}
