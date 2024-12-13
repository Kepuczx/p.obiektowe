public class Adres implements IAdress {
    private String ulica;
    private int numerDomu;
    private Integer numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy)
    {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, int numerDomu, String miasto, String KodPocztowy)
    {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = KodPocztowy;
    }

    @Override
    public String toString() {
        if(numerMieszkania != null)
            return "Kod Pocztowy: " + kodPocztowy + " Miasto: "+miasto+ '\n' +
                "Ulica: " + ulica +" numer domu: "+numerDomu + " numer mieszkania: "+numerMieszkania;
        return "Kod Pocztowy: " + kodPocztowy + " Miasto: "+miasto+ '\n' +
                "Ulica: " + ulica +" numer domu: "+numerDomu;
    }

    @Override
    public boolean przed(String kodPocztowy1, String kodPocztowy2)
    {
        String temp1 = kodPocztowy1.replace("-", "");
        String temp2 = kodPocztowy2.replace("-", "");
        int kod1 = Integer.parseInt(temp1);
        int kod2 = Integer.parseInt(temp2);
        return kod1 < kod2;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if(ulica == null || ulica.trim().isEmpty())
            throw new IllegalArgumentException();
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        if(numerDomu <= 0)
            throw new IllegalArgumentException();
        this.numerDomu = numerDomu;
    }

    public Integer getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(Integer numerMieszkania) {
        if(numerMieszkania == null)
            throw new IllegalArgumentException();
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if(miasto == null || miasto.trim().isEmpty())
            throw new IllegalArgumentException();
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if(kodPocztowy == null || kodPocztowy.trim().isEmpty())
            throw new IllegalArgumentException();
        this.kodPocztowy = kodPocztowy;
    }
}
