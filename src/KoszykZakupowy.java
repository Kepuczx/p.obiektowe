import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KoszykZakupowy implements IKoszykZakupowy {
    private Map<Produkt, Integer> listaProduktow;

    public KoszykZakupowy()
    {
        this.listaProduktow = new HashMap<>();
    }

    @Override
    public void dodajProdukt(Produkt p, int ilosc)
    {
        if (p.getIloscNaMagazynie() >= ilosc)
        {
            listaProduktow.put(p, listaProduktow.getOrDefault(p, 0) + ilosc);
            p.usunZMagazynu(ilosc);
        }
    }

    @Override
    public String toString() {
        return listaProduktow.entrySet().stream()
                .map(entry -> entry.getKey().getNazwa() + " : " + entry.getValue())
                .collect(Collectors.joining("\n"));
    }

    @Override
    public double obliczCalkowitaWartosc()
    {
        double wartosc = 0;
        for(Map.Entry<Produkt, Integer> entry : listaProduktow.entrySet())
        {
            wartosc += entry.getKey().getCena() * entry.getValue();
        }
        return wartosc;
    }

    public Map<Produkt, Integer> getListaProduktow() {
        return listaProduktow;
    }

    public void setListaProduktow(Map<Produkt, Integer> listaProduktow) {
        if(listaProduktow == null)
            throw new IllegalArgumentException();
        this.listaProduktow = listaProduktow;
    }
}
