public class Adres {
    private String ulica;
    private String numberDomu;
    private String numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String numberDomu, String numerMieszkania, String miasto,String kodPocztowy) {
        this.ulica = ulica;
        this.numberDomu = numberDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, String numberDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numberDomu = numberDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(kodPocztowy).append(" ").append(miasto).append("\n").append(ulica).append(" ").append(numberDomu).append(" ").append(numerMieszkania != null ? "/"+numerMieszkania : "");

        return sb.toString();
    }

    public boolean przed(Adres innyAdres){
        return this.kodPocztowy.compareTo(innyAdres.getKodPocztowy())<0;
    }
}
