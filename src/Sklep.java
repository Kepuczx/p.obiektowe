import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class Sklep implements ISklep {
    private ArrayList<Produkt> produkty;
    private String nazwaSklepu;
    private Date dataPowstania;
    private Magazyn magazynSklepu;

    public Sklep(String nazwaSklepu, Date dataPowstania, Magazyn magazynSklepu)
    {
        Date currentDate = new Date();
        if(dataPowstania.after(currentDate))
            throw new IllegalArgumentException();
        this.produkty = new ArrayList<>();
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }

    @Override
    public void dodajProdukt(Produkt p)
    {
        if(!produkty.contains(p))
            produkty.add(p);
    }

    @Override
    public String toString()
    {
        return produkty.stream().map(Produkt -> Produkt.getNazwa()).collect(Collectors.joining("\n"));
    }

    @Override
    public void wyszukajProduktu(String nazwa)
    {
        for(Produkt p : produkty){
            if (nazwa.equalsIgnoreCase(p.getNazwa())) {
                System.out.println(p);;
                return;
            }
        }
    }

    @Override
    public void zakupy(KoszykZakupowy k, Produkt p, int ilosc)
    {
        if (p.getIloscNaMagazynie() >= ilosc)
            k.dodajProdukt(p, ilosc);
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        if(produkty == null)
            throw new IllegalArgumentException();
        this.produkty = produkty;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if(nazwaSklepu == null ||nazwaSklepu.trim().isEmpty())
            throw new IllegalArgumentException();
        this.nazwaSklepu = nazwaSklepu;
    }

    public String getDataPowstania() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(dataPowstania);
    }

    public void setDataPowstania(Date dataPowstania) {
        Date currentDate = new Date();
        if(dataPowstania == null || dataPowstania.after(currentDate))
            throw new IllegalArgumentException();
        this.dataPowstania = dataPowstania;
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if(magazynSklepu == null)
            throw new IllegalArgumentException();
        this.magazynSklepu = magazynSklepu;
    }
}