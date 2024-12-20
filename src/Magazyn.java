import java.util.HashMap;
import java.util.Map;

public class Magazyn {
    private Map<String, Produkt> produkty;

    public Magazyn(){
        this.produkty = new HashMap<>();
    }
    public void wyswietlAsortyment(){
        if(produkty.isEmpty()){
            System.out.println("Magazyn nie posiada asortymentu.");
        }else{
            System.out.println("Asortyment magazynu: ");
            for(String nazwa : produkty.keySet()){
                System.out.println("- "+nazwa);
            }
        }
    }


}
