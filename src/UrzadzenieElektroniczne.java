public class UrzadzenieElektroniczne extends Dzialanie{
    private String nazwa;
    public UrzadzenieElektroniczne(String nazwa){
        this.nazwa = nazwa;
    }
    @Override
    public void napraw(){
        System.out.println("Naprawiam "+nazwa);
    }
    @Override
    public void uzyj(){
        System.out.println("Uzywam "+nazwa);
    }
    @Override
    public void zepsuj(){
        System.out.println("Psuje "+nazwa);
    }
    @Override
    public void wlacz(){
        System.out.println("Wlaczam "+nazwa);
    }
    @Override
    public void wylacz(){
        System.out.println("Wylaczam "+nazwa);
    }
}
