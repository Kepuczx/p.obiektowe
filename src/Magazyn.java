import java.util.HashMap;
import java.util.stream.Collectors;

public class Magazyn implements IMagazyn {
    private HashMap<Produkt, Integer> produkty;

    public Magazyn()
    {
        produkty = new HashMap<>();
    }

    @Override
    public String toString() {
        return produkty.keySet().stream()
                .map(integer -> integer.getNazwa() + " : " + integer.getIloscNaMagazynie())
                .collect(Collectors.joining("\n"));
    }

    public HashMap<Produkt, Integer> getProdukty() {
        return produkty;
    }

    public void setProdukty(HashMap<Produkt, Integer> produkty) {
        if(produkty == null)
            throw new IllegalArgumentException();
        this.produkty = produkty;
    }
}
