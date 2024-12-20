
public class Warzywo extends Jadalny {
    private String nazwa;
    public Warzywo(String nazwa) {
        this.nazwa= nazwa;
    }
    @Override
    public String smak() {
        return "Warzywny smak";
    }

    @Override
    public void umyj() {
        System.out.println("Myję warzywo " + nazwa);
    }

    @Override
    public void zjedz() {
        System.out.println("Jem warzywo " + nazwa);
    }
}
