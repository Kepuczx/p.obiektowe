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
    public static class Item{
        private String nazwa;
        private double cena;
        private int ilosc;
        public Item(String nazwa, int ilosc, double cena){
            this.nazwa=nazwa;
            this.cena=cena;
            this.ilosc=ilosc;
        }
    }
    public static class KoszykZakupowy{

        ArrayList<Item> listaproduktow = new ArrayList<>();

        public void dodajProdukt(Produkt produkt, int ilosc){
            double cena = produkt.getCena() * ilosc;
            if(ilosc > produkt.getIloscNaMagazynie()){
                System.out.println("Brak takiej ilosci w magazynie!!!");
            }
            else {
                listaproduktow.add(new Item(produkt.getNazwa(), ilosc, cena));
                produkt.usunZMagazynu(ilosc);
                wyswietlZawartoscdKoszyka();
            }

        }
        public void wyswietlZawartoscdKoszyka(){
            System.out.println("Zawartosc w koszyku: ");
            for(Item item:listaproduktow){
                System.out.println(item.nazwa+" Cena: " +item.cena+" Ilosc: "+ item.ilosc);
            }
        }
    }


    public static void main(String[] args) {

        Produkt palety = new Produkt("Palety", 4.99, 100);
        Produkt zupki = new Produkt("zupki chinskie", 4.99, 100);
        palety.wyswietlInformacje();
        zupki.wyswietlInformacje();
        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.dodajProdukt(palety, 100);
        palety.wyswietlInformacje();






    }


}