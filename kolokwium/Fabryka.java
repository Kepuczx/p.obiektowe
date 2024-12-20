import java.util.ArrayList;

public class Fabryka {
    private ArrayList<Elf> listaElfow;
    private int dlGeo;
    private int szGeo;
    public Fabryka(int dlGeo, int szGeo) {
        this.listaElfow = new ArrayList<>();
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }

    public int getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(int szGeo) {
        if(szGeo > -90 && szGeo < 90) {
            this.szGeo = szGeo;
        }else{
            System.out.println("szGeo musi sie znajdowac pomiedzy: -90 a 90.");
            return;
        }
    }

    public int getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(int dlGeo) {
        if(dlGeo > -180 && dlGeo < 180) {
            this.dlGeo = dlGeo;
        }else{
            System.out.println("szGeo musi sie znajdowac pomiedzy: -180 a 180.");
            return ;
        }
    }

    public ArrayList<Elf> getListaElfow() {
        return listaElfow;
    }

    public void setListaElfow(ArrayList<Elf> listaElfow) {
        this.listaElfow = listaElfow;
    }

    public void dodajPracownika(Elf elf){
        listaElfow.add(elf);
        System.out.println("Dodano "+elf.getImie()+" jako pracownika.");
    }
    public void usunPracownika(Elf elf){
        if(listaElfow.isEmpty()){
            System.out.println("W fabryce nie ma pracownikow.");
        }else{
            listaElfow.remove(elf);
        }
    }
    public Elf najstarszyPracownik(){
        int wiek = 0;

        for(Elf el : listaElfow){
            if(el.getWiek() > wiek){
                wiek = el.getWiek();
            }
        }
        for(Elf el : listaElfow){
            if(el.getWiek() == wiek){
                return el;
            }
        }
        return null;
    }

}
