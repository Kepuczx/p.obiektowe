public interface IKlient {
    public void dodajZamowienie(Zamowienie z);
    public String toString();
    public boolean equals(Object o);
    public int hashCode();
    public double obliczLacznyKosztZamowien();
    public default void Przedstaw()
    {
        System.out.println("imie i nazwisko");
    }
}
