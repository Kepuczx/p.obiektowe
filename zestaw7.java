import java.util.ArrayList;

public class Main {
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

class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa + ", Cena: " + cena + " zł, Ilość na magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int x) {
        iloscNaMagazynie += x;
    }

    public void usunZMagazynu(int x) {
        if (x > iloscNaMagazynie) {
            System.out.println("W magazynie nie ma tyle rzeczy, bądź jest pusty.");
        } else {
            iloscNaMagazynie -= x;
        }
    }
}

class KoszykZakupowy {
    private ArrayList<Produkt> produkty;

    public KoszykZakupowy() {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Magazyn magazyn, String nazwaProduktu, int ilosc) {
        if (magazyn.pobierzProdukt(nazwaProduktu, ilosc)) {
            for (Produkt p : produkty) {
                if (p.getNazwa().equals(nazwaProduktu)) {
                    p.dodajDoMagazynu(ilosc);
                    return;
                }
            }
            produkty.add(new Produkt(nazwaProduktu, znajdzCeneProduktu(magazyn, nazwaProduktu), ilosc));
        }
    }

    private double znajdzCeneProduktu(Magazyn magazyn, String nazwaProduktu) {
        for (Produkt p : magazyn.getProdukty()) {
            if (p.getNazwa().equals(nazwaProduktu)) {
                return p.getCena();
            }
        }
        return 0;
    }

    public void wyswietlZawartoscKoszyka() {
        for (Produkt p : produkty) {
            p.wyswietlInformacje();
        }
    }

    public double obliczCalkowitaWartosc() {
        double total = 0;
        for (Produkt p : produkty) {
            total += p.getCena() * p.getIloscNaMagazynie();
        }
        return total;
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }
}

class Sklep {
    private ArrayList<Produkt> produkty;

    public Sklep() {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        this.produkty.add(produkt);
    }

    public void wyswietlOferty() {
        for (Produkt produkt : produkty) {
            produkt.wyswietlInformacje();
        }
    }

    public Produkt wyszukajProduktu(String nazwaProduktu) {
        for (Produkt produkt : produkty) {
            if (produkt.getNazwa().equalsIgnoreCase(nazwaProduktu)) {
                return produkt;
            }
        }
        return null;
    }

    public void zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc) {
        Produkt produkt = wyszukajProduktu(nazwaProduktu);
        if (produkt != null && ilosc <= produkt.getIloscNaMagazynie()) {
            koszyk.dodajProdukt(this, nazwaProduktu, ilosc);
            produkt.usunZMagazynu(ilosc);
            System.out.println("Produkt został dodany do koszyka.");
        } else {
            System.out.println("Produkt nie znaleziony lub niewystarczająca ilość.");
        }
    }
}

class Magazyn {
    private ArrayList<Produkt> produkty;

    public Magazyn() {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        for (Produkt p : produkty) {
            if (p.getNazwa().equals(produkt.getNazwa())) {
                p.dodajDoMagazynu(produkt.getIloscNaMagazynie());
                return;
            }
        }
        produkty.add(produkt);
    }

    public boolean pobierzProdukt(String nazwa, int ilosc) {
        for (Produkt p : produkty) {
            if (p.getNazwa().equals(nazwa)) {
                if (p.getIloscNaMagazynie() >= ilosc) {
                    p.usunZMagazynu(ilosc);
                    return true;
                } else {
                    System.out.println("Nie ma wystarczającej ilości produktu w magazynie.");
                    return false;
                }
            }
        }
        System.out.println("Produkt o nazwie '" + nazwa + "' nie istnieje w magazynie.");
        return false;
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }
}
