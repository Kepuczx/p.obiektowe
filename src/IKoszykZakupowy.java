public interface IKoszykZakupowy {
    public void dodajProdukt(Produkt p, int ilosc);
    public String toString();
    public double obliczCalkowitaWartosc();
    public default void dodaj()
    {
        System.out.println("dodalem");
    }
}
