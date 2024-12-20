public class Renifer {
    private String imie;
    private int predkosc;
    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void nakarmRenifera(){
        this.predkosc+=5;
    }
}
