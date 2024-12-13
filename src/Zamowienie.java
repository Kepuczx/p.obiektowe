import java.util.Map;

public class Zamowienie implements IZamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy)
    {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Zamówione";
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }

    // public void ustawStatusZamowienia(String status)
    //{
    //    statusZamowienia = status;
    //}

    @Override
    public String toString() {
        return koszykZakupowy.toString()+ "\n" + "Status: " + statusZamowienia;
    }

    public void finalizujZamowienie()
    {
        if(platnosc.getStatusPlatnosci().equalsIgnoreCase("Opłacone"))
            this.setStatusZamowienia("Gotowe do wysyłki");
    }

    @Override
    public void zwrocProdukt(Produkt p, int ilosc)
    {
        Integer iloscProduktu = koszykZakupowy.getListaProduktow().get(p);
        if(iloscProduktu != null && ilosc > 0) {
            if (iloscProduktu > ilosc)
                koszykZakupowy.getListaProduktow().put(p, iloscProduktu - ilosc);
            else
                koszykZakupowy.getListaProduktow().remove(p);
            p.dodajDoMagazynu(ilosc);
        }
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }

    public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy) {
        if(koszykZakupowy == null || koszykZakupowy.getListaProduktow().isEmpty())
            throw new IllegalArgumentException();
        this.koszykZakupowy = koszykZakupowy;
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        if(statusZamowienia == null || statusZamowienia.trim().isEmpty())
            throw new IllegalArgumentException();
        this.statusZamowienia = statusZamowienia;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        if(platnosc == null)
            throw new IllegalArgumentException();
        this.platnosc = platnosc;
    }
}