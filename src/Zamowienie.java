import java.util.ArrayList;

public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.statusZamowienia = "Niegotowe";
        this.koszykZakupowy = koszykZakupowy;
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }
    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }
    public void setStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }

    public void wyswietlZamowienie(){
        System.out.println("Status zamowienia: " + getStatusZamowienia());
        System.out.println(koszykZakupowy);
    }
    public double kosztZamowienia(){
        return koszykZakupowy.obliczCalkowitaWartosc();
    }
    public void finalizujZamowienie(){
        if (platnosc.getStatusPlatnosci().equals("Nieopłacone")) {
            System.out.println("Zamówienie nie zostało opłacone. Proszę dokonać płatności.");
        } else {
            setStatusZamowienia("Gotowe do wysyłki.");
            System.out.println("Zamówienie zostało sfinalizowane i jest gotowe do wysyłki.");
        }
    }
    public void zwrocProdukt(Sklep sklep,String nazwa, int ile){
        Produkt produkt = koszykZakupowy.wyszukajProdukt(nazwa);
        if(produkt == null || produkt.getIloscNaMagazynie() < ile){
            System.out.println("Nie można zwrócić produktu. Sprawdź nazwę lub ilość w koszyku.");
            return;
        }
        koszykZakupowy.odejmijProdukt(nazwa, ile);
        Produkt produktWSklepie = sklep.wyszukajProduktu(nazwa);
        if(produktWSklepie != null){
            produktWSklepie.dodajDoMagazynu(ile);
        }else{
            System.out.println("Produkt nie istnieje.");
        }
        double nowaKwota = koszykZakupowy.obliczCalkowitaWartosc();
        platnosc = new Platnosc(nowaKwota);
        System.out.println("Zwrócono " + ile + " szt. produktu \"" + nazwa + "\".");
    }

}
