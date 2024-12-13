public interface IZamowienie {
    public String toString();
    public void zwrocProdukt(Produkt p, int ilosc);
    public default void bazowaCena()
    {
        System.out.println("Najlepsza na rynku");
    }
}
