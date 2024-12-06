import java.util.ArrayList;


public class zestaw6 {

    public static class Produkt {
        private String nazwa;
        private double cena;
        private int iloscNaMagazynie;

        public String getNazwa() {
            return nazwa;
        }
        public double getCena() {
            return cena;
        }
        public int getIloscNaMagazynie() {
            return iloscNaMagazynie;
        }


        public Produkt(String nazwa,double cena,int iloscNaMagazynie){
            this.nazwa=nazwa;
            this.cena=cena;
            this.iloscNaMagazynie=iloscNaMagazynie;
        }
        public void wyswietlInformacje(){
            System.out.println("Nazwa: "+ nazwa+", Cena: "+ cena+" zł, Ilośc na magazynie: "+iloscNaMagazynie);
        }
        public void dodajDoMagazynu(int x){
            iloscNaMagazynie+=x;
        }
        public void usunZMagazynu(int x){
            if(x > iloscNaMagazynie){
                System.out.println("W magazynie nie ma tyle rzeczy, bądź jest pusty.");
            }
            else{
                iloscNaMagazynie-=x;
            }
        }

    }

    public static class KoszykZakupowy{

        private ArrayList<Produkt> produkty;

        public KoszykZakupowy(){
            this.produkty=new ArrayList<>();
        }
        public void dodajProdukt(Produkt produkt, int x){
            if(produkt.iloscNaMagazynie >=x){
                produkt.usunZMagazynu(x);
                produkty.add(new Produkt(produkt.nazwa, produkt.cena, x));
            }else{
                System.out.println("Za mało towaru");
            }
        }

        public void wyswietlZawartoscKoszyka(){
            for(Produkt p: produkty){
                p.wyswietlInformacje();
            }
        }
        public double obliczCalkowitaWartosc(){
            double total = 0;
            for(Produkt p: produkty){
                total += p.cena * p.iloscNaMagazynie;
            }
            return total;
        }


    }
    public static class Zamowienie{
        private KoszykZakupowy koszyk;
        private String statusZamowienia;
        private Platnosc platnosc;
        private

        public Zamowienie(KoszykZakupowy koszyk, String statusZamowienia){
            this.koszyk=koszyk;
            this.statusZamowienia=statusZamowienia;
            this.platnosc= new Platnosc(koszyk.obliczCalkowitaWartosc());
        }
        public void ustawStatusZamowienia(String status){
            this.statusZamowienia = status;
        }
        public void wyswietlZamowienie(){
            System.out.println("Status zamówienia: " + statusZamowienia);
            koszyk.wyswietlZawartoscKoszyka();
        }
        public void finalizujZamowienie(){
            if(this.platnosc.getStatusPlatnosci().equals("Opłacone")){
                this.statusZamowienia = "Gotowe do wysyłki";
            }else{
                System.out.println("Płatność nie została jeszcze dokonana.");
            }
        }
        public void zwrocProdukt(String nazwaProduktu, int ilosc){
            for(Produkt p : koszyk.getProdukty()){

            }
        }

    }
    public static class Klient{
        private String imie;
        private String nazwisko;
        private ArrayList<Zamowienie> listaZamowien;

        public Klient(String imie, String nazwisko){
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.listaZamowien = new ArrayList<>();
        }
        public void dodajZamowienie(Zamowienie zamowienie){
            this.listaZamowien.add(zamowienie);
        }
        public void wyswietlHistorieZamowien(){
            for(Zamowienie zamowienie:listaZamowien){
                zamowienie.wyswietlZamowienie();
            }
        }
        public double obliczLacznyKosztZamowien(){
            double total = 0;
            for(Zamowienie zamowienie : listaZamowien){
                total += zamowienie.koszyk.obliczCalkowitaWartosc();
            }
            return total;
        }
    }

    public static class Sklep{
        private ArrayList<Produkt> produkty;
        public Sklep(){
            this.produkty= new ArrayList<>();
        }
        public void dodajProdukt(Produkt produkt){
            this.produkty.add(produkt);
        }
        public void wyswietlOferty(){
            for(Produkt produkt:produkty){
                produkt.wyswietlInformacje();
            }
        }
        public Produkt wyszukajProduktu(String x){
            for(Produkt produkt:produkty){
                if(produkt.nazwa.equals(x)){
                    return produkt;
                }
            }
            return null;
        }
        public void zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc){
            Produkt produkt = wyszukajProduktu(nazwaProduktu);
            if(produkt != null && ilosc <= produkt.iloscNaMagazynie){
                koszyk.dodajProdukt(produkt, ilosc);
                produkt.usunZMagazynu(ilosc);
            }else{
                System.out.println("Produkt nie znaleziony lub niewystarczajaca ilosc");
            }
        }
    }
    public static class Platnosc{
        private double kwota;
        private String statusPlatnosci;
        public Platnosc(double kwota){
            this.kwota=kwota;
            this.statusPlatnosci="Nieopłacone";
        }
        public void zaplac(double kwota){
            this.kwota = kwota;
            this.statusPlatnosci = "Opłacone";
        }
        public double getKwota(){
            return kwota;
        }
        public String getStatusPlatnosci(){
            return statusPlatnosci;
        }
    }


    public static void main(String[] args) {

        Sklep sklep = new Sklep();
        Produkt jablko = new Produkt("Jabłko", 2.50, 100);
        Produkt banan = new Produkt("Banan", 3.00, 150);

        sklep.dodajProdukt(jablko);
        sklep.dodajProdukt(banan);
        sklep.wyswietlOferty();
        KoszykZakupowy koszyk = new KoszykZakupowy();
        sklep.zakupy(koszyk, "Jabłko", 10);
        sklep.zakupy(koszyk, "Banan", 20);

        koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Całkowita wartość koszyka: " + koszyk.obliczCalkowitaWartosc());

        sklep.wyswietlOferty();




    }


}