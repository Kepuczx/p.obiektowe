public interface IProdukt {
    public boolean equals(Object o);
    public int hashCode();
    public String toString();
    public void dodajDoMagazynu(int ilosc);
    public default void CzyjestesProduktem()
    {
        System.out.println("Jestem Produktem");
    }
}
