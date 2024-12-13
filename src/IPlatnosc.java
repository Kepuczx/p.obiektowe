public interface IPlatnosc {
    public void zaplac();
    public boolean equals(Object o);
    public int hashCode();
    public default void placenie()
    {
        System.out.println("1...2...3...Bip Bop");
    }
}
