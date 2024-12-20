import java.util.ArrayList;
import java.util.Objects;

public class Klient extends Osoba {

    private ArrayList<Zamowienie> listaZamowien;
    private Adres adres;
    public Klient(String imie, String nazwisko, Adres adres) {
        super(imie, nazwisko);
        this.listaZamowien = new ArrayList<>();
        this.adres = adres;
    }


    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
    }
    public void wyswietlHistorieZamowien(){
        System.out.println(getImie()+" "+getNazwisko());
        double koszt = 0;
        for(Zamowienie z : listaZamowien) {
            z.wyswietlZamowienie();
        }
        System.out.println("Suma: "+obliczLacznyKosztZamowien());
    }
    public double obliczLacznyKosztZamowien(){
        double koszt = 0;
        for(Zamowienie z : listaZamowien) {
            koszt += z.kosztZamowienia();
        }
        return koszt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getNazwisko(),adres);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        Klient klient = (Klient) o;
        return Objects.equals(adres, klient.adres);
    }
}
