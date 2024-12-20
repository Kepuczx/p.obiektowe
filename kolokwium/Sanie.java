import java.util.ArrayList;

public class Sanie {
    private ArrayList<Renifer> listaRenif;
    public Sanie() {
        this.listaRenif = new ArrayList();
    }

    public ArrayList<Renifer> getListaRenif() {
        return listaRenif;
    }

    public void setListaRenif(ArrayList<Renifer> listaRenif) {
        this.listaRenif = listaRenif;
    }

    public void dodajRenifera(Renifer renifer){
        listaRenif.add(renifer);
    }
    public void sumaPredkosci(){
        if(listaRenif.isEmpty()){
            System.out.println("Suma predkosci wynosi 0, gdyz nie ma tam zadnych reniferow.");
        }else{
            int suma = 0;
            for(Renifer r: listaRenif){
                suma += r.getPredkosc();
            }
            System.out.println("Suma predkosci: " + suma);
        }
    }
    public Renifer najwolniejszyRenifer(){
        if(listaRenif.isEmpty()){
            return null;
        }else{
            int predkosc = 0;
            for(Renifer r: listaRenif){
                predkosc = r.getPredkosc();
            }
            for(Renifer r: listaRenif){
                if(r.getPredkosc() < predkosc){
                    predkosc = r.getPredkosc();
                }
            }
            for(Renifer r: listaRenif){
                if(r.getPredkosc() == predkosc){
                    return r;
                }
            }
        }
        return null;
    }
}
