public interface IAdress {
    public String toString();
    public boolean przed(String kodPocztowy1, String kodPocztowy2);
    public default void printWarszawa() {
        System.out.println("Warszawa");
    }
}
