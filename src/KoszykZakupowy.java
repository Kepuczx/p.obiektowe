import java.util.ArrayList;
import java.util.HashMap;

interface KoszykZakupowyInterfejs{
    void dodajProdukt(Produkt produkt, int ile);
    Produkt wyszukajProdukt(String nazwa);
    void odejmijProdukt(String nazwa, int ile);
    double obliczCalkowitaWartosc();

}


public class KoszykZakupowy implements KoszykZakupowyInterfejs{
    private HashMap<Produkt, Integer> lista;

    public KoszykZakupowy() {
        this.lista = new HashMap<>();
    }
    @Override
    public void dodajProdukt(Produkt p, int ile) {
        if(ile <= 0){
            System.out.println("Ilosc dodawana do koszyka nie moze byc 0 badz mniej.");

        }else if (p != null && ile <= p.getIloscNaMagazynie()){
            p.usunZMagazynu(ile);
            lista.put(p, lista.getOrDefault(p, 0) + ile);
            System.out.println("Dodano do koszyka: "+p.getNazwa()+" x"+ile);
        }else{
            System.out.println("Niewystarczajaca ilosc na magazynie");
        }
    }
    @Override
    public Produkt wyszukajProdukt(String nazwa) {
        for(Produkt produkt : lista.keySet()){
            if(produkt.getNazwa().equals(nazwa)){
                return produkt;
            }
        }
        System.out.println("Nie ma takiego produktu.");
        return null;
    }
    @Override
    public void odejmijProdukt(String nazwa, int ile){
        Produkt produkt = wyszukajProdukt(nazwa);
        if(produkt.getIloscNaMagazynie() - ile <0){
            System.out.println("Nie ma tyle produktow w koszyku.");
        } else if (produkt.getIloscNaMagazynie() - ile == 0) {
            lista.remove(produkt);
        } else{
            produkt.odejmij(ile);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Produkt produkt : lista.keySet()){
            int ilosc = lista.get(produkt);
            sb.append(produkt.getNazwa()).append(" ").append(produkt.getCena()).append(" x").append(ilosc).append("\n");
        }
        return sb.toString();
    }

    @Override
    public double obliczCalkowitaWartosc(){
        double wartosc = 0;
        for(Produkt p : lista.keySet()){
            wartosc += lista.get(p) * p.getCena();
        }
        return wartosc;
    }

}
