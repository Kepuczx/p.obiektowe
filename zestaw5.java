//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class zestaw5 {

    //zad1

    public static void append(int[] tab1, int[] tab2 ) {
        int dlugosc = tab1.length + tab2.length;
        int[] newtab1 = new int[dlugosc];
        int i =0, j = 0, k = 0;
        while(i < tab1.length){
            newtab1[k] = tab1[i];
            i++;
            k++;
        }
        while(j < tab2.length){
            newtab1[k] = tab2[j];
            j++;
            k++;
        }
        for(int h = 0; i < dlugosc ; h++){
            System.out.print(newtab1[h] + " ");
        }

    }
    //zad2
    public static int[] merge(int[] tab1, int[] tab2) {
        int[] newtab1 = new int[tab1.length + tab2.length];
        int i = 0, j = 0;
        int k = 0;
        while(i < tab1.length && j < tab2.length){
            if(k % 2 == 0){
                newtab1[k] = tab1[i];
                i++;
            }
            else{
                newtab1[k] = tab2[j];
                j++;
            }
            k++;
        }
        if(tab1.length + tab2.length/2 > tab1.length){
            while(j < tab2.length){
                newtab1[k] = tab2[j];
                j++;
                k++;
            }
        }
        else{
            while(i < tab1.length){
                newtab1[k] = tab1[i];
                i++;
                k++;
            }
        }
        return newtab1;
    }

    //zad3

    public static int[] mergeSorted(int[] tab1, int[] tab2) {
        int dlugosc = tab1.length + tab2.length;
        int[] newtab1 = new int[dlugosc];
        int i =0, j = 0, k = 0;
        while(i < tab1.length){
            newtab1[k] = tab1[i];
            i++;
            k++;
        }
        while(j < tab2.length){
            newtab1[k] = tab2[j];
            j++;
            k++;
        }
        for(int n = 0; n < dlugosc ; n++){
            for(int m = 0 ; m < n ; m++){
                if(newtab1[m] > newtab1[n]){
                    int temp = newtab1[m];
                    newtab1[m] = newtab1[n];
                    newtab1[n] = temp;
                }
            }
        }

        return newtab1;
    }

    //zad4
    public static ArrayList<Character> toArrayList(String napis){
        ArrayList<Character> ArrayList = new ArrayList<>();
        int dlugosc = napis.length();
        int wszystkie = 0;
        int ascii = 0;
        for(int i = 0; i < dlugosc; i++){

        }


        return ArrayList;
    }


    public static void main(String[] args) {
        int[] tab = {7, 3,4,23, 7};
        int[] tab2 = {8, 10, 52,43, 21, 61};
        int[] newtab = mergeSorted(tab2, tab);
        for(int i = 0; i <newtab.length; i++){
            System.out.print(newtab[i] + " ");
        }
    }
}