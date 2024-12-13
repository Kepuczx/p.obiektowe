public class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.trim().isEmpty())
            throw new IllegalArgumentException();
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko == null || nazwisko.trim().isEmpty())
            throw new IllegalArgumentException();
        this.nazwisko = nazwisko;
    }
}
