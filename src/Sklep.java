import java.util.ArrayList;

public class Sklep {
    private ArrayList<Produkt> listaProdukt;
    public Sklep() {
        this.listaProdukt = new ArrayList<>();
    }
    public void dodajProdukt(Produkt p) {
        listaProdukt.add(p);
        System.out.println("Dodano produkt.");
    }
    public void wyswietlOferty(){
        if(listaProdukt.isEmpty()){
            System.out.println("W sklepie nie ma produktów");
        }else{
            System.out.println("Sklep:");
            for(Produkt p : listaProdukt){
                p.wyswietlInformacje();
            }
        }
    }
    public Produkt wyszukajProduktu(String nazwa){
        for(Produkt p : listaProdukt){
            if(p.getNazwa().equals(nazwa)){
                return p;
            }
        }
        System.out.println("Nie ma tego produktu.");
        return null;
    }
    public void dodajProduktu(String nazwa, int ile){
        Produkt produkt = wyszukajProduktu(nazwa);
        produkt.dodaj(ile);

    }

    public boolean zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ile){
        Produkt produkt = wyszukajProduktu(nazwaProduktu);
        if(produkt == null){
            System.out.println("Produkt nie istnieje.");
            return false;
        }
        if(produkt.getIloscNaMagazynie() < ile){
            System.out.println("Nie ma tyle itemow w magazynie.");
            return false;
        }

        koszyk.dodajProdukt(produkt, ile);
        produkt.usunZMagazynu(ile);
        System.out.println("Dodano "+ ile+ " szt. produktu \""+nazwaProduktu);
        return true;
    }
}
