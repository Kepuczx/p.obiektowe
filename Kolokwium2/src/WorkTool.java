abstract class WorkTool {
    String name;
    int productionYear;
    WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }
    abstract void use();

}
