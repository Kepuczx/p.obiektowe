public abstract class UrzadzenieElektroniczne extends ProduktPrzemyslowy {
    UrzadzenieElektroniczne(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    public abstract void napraw();
    public abstract void uzyj();
    public abstract void zepsuj();
    public abstract void wlacz();
    public abstract void wylacz();
}
