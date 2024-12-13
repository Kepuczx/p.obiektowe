import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {



        Sklep sklep = new Sklep("Jas", new Date(101, Calendar.FEBRUARY,1), new Magazyn());
        Produkt krzeslo = new Produkt("krzeslo", 19.99, 7);
        Produkt stol = new Produkt("stol", 25.89, 10);
        Produkt blat = new Produkt("blat", 27.49, 10);
        sklep.dodajProdukt(krzeslo); sklep.dodajProdukt(stol); sklep.dodajProdukt(blat);
        Klient klient = new Klient("Jan", "Kowalski", new Adres("Prosta", 5, "Olsztyn", "10-810"));
        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.dodajProdukt(stol, 5);

        Zamowienie zamowienie = new Zamowienie(koszyk);
        klient.dodajZamowienie(zamowienie);

        //System.out.println(sklep);
        //System.out.println(sklep.getDataPowstania());

        Agrest agrest = new Agrest("czerwony agrest", 19.99, 25);
        agrest.CzyjestesProduktem();
    }
}