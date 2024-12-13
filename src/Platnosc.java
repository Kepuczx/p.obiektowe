import java.util.Objects;

public class Platnosc implements IPlatnosc{
    private double kwota;
    private String statusPlatnosci;

    Platnosc(double kwota)
    {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    @Override
    public void zaplac()
    {
        statusPlatnosci = "Opłacone";
        kwota = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platnosc platnosc = (Platnosc) o;
        return Double.compare(kwota, platnosc.kwota) == 0 && Objects.equals(statusPlatnosci, platnosc.statusPlatnosci);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kwota, statusPlatnosci);
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        if(kwota < 0.0)
            throw new IllegalArgumentException();
        this.kwota = kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        if(statusPlatnosci == null || statusPlatnosci.trim().isEmpty())
            throw new IllegalArgumentException();
        this.statusPlatnosci = statusPlatnosci;
    }
}
