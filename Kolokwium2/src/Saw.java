public class Saw extends WorkTool {

    Saw(String name, int productionYear){
        super(name, productionYear);
    }

    void use() {
        System.out.println("Piła piłuje");
    }
}
