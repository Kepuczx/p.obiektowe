public class Hammer extends WorkTool{
    Hammer(String name, int productionYear){
        super(name, productionYear);
    }

    void use(){
        System.out.println("Młotek działa");
    }
}
