public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;
    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cześć, nazywam się ").append(imie).append(", mam ").append(wiek).append(" lat, a moje stanowisko to ").append(stanowisko).append(".");
        return sb.toString();
    }

    public void przedstawSie(){
        System.out.println("Cześć, nazywam się "+imie + ", mam " + wiek + " lat, a moje stanowisko to " + stanowisko+".");
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Elf) {
            Elf el = (Elf) obj;
            return imie.equals(el.imie) && wiek == el.wiek;
        }
        return false;
    }

}
