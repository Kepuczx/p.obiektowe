public class Owoc extends Jadalny{
    private String nazwa;
    public Owoc(String nazwa){
        this.nazwa = nazwa;
    }
    @Override
    public String smak(){
        return "Owocowy smak";
    }
    @Override
    public void umyj(){
        System.out.println("Myje owoc "+nazwa);
    }
    @Override
    public void zjedz(){
        System.out.println("Jem "+nazwa);
    }
}
