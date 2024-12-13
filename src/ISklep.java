public interface ISklep {
    public void dodajProdukt(Produkt p);
    public String toString();
    public void wyszukajProduktu(String nazwa);
    public void zakupy(KoszykZakupowy k, Produkt p, int ilosc);
    public default void CzyDuzySklep(){
        System.out.println("mamy tylko duze sklepy");
    }
}
