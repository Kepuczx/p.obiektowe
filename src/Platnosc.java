import java.util.Objects;

public class Platnosc {
    private double kwota;
    private String statusPlatnosci;
    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void zaplac(){
        if(!statusPlatnosci.equals("Opłacone")){
            this.statusPlatnosci = "Opłacone";

        }else{
            System.out.println("Platnosc zostala juz wczesniej oplacona.");
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(kwota, statusPlatnosci);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platnosc platnosc = (Platnosc) o;
        return Double.compare(platnosc.kwota, kwota) == 0 && Objects.equals(statusPlatnosci, platnosc.statusPlatnosci);
    }

}
