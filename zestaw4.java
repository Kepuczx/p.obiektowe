import java.util.Random;
import java.util.Arrays;


public class zestaw4 {

    //zad1
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        Random rand = new Random();
        int[] tab = new int[n];
        int losowa;

        for(int i =0; i<n; i++) {
            losowa = rand.nextInt(minWartosc, maxWartosc+1);
            tab[i] = losowa;
        }



        return tab;
    }
    //zad2
    public static void wypiszTablice(int[] tab,int n, int m){


            for(int i = 0 ; i<n; i++) {
                System.out.print(tab[i] + " ");
                if((i+1) % m == 0 && i > 0){
                    System.out.println();
                }


        }
    }

    //zad3
    public static int ileNieparzystych(int[] tab){
        int ilosc = 0;
        for(int i = 0; i<tab.length; i++){
            if(tab[i] % 2 == 1){
                ilosc += 1;
            }
        }
        return ilosc;
    }
    public static int Parzystych(int[] tab){
        int ilosc = 0;
        for(int i = 0; i<tab.length; i++){
            if(tab[i] % 2 == 0){
                ilosc += 1;
            }
        }
        return ilosc;
    }
    public static int ileDodatnich(int[] tab){
        int ilosc = 0;
        for(int i = 0; i<tab.length; i++){
            if(tab[i] > 0){
                ilosc += 1;
            }
        }
        return ilosc;
    }
    public static int ileUjemnych(int[] tab){
        int ilosc = 0;
        for(int i = 0; i<tab.length; i++){
            if(tab[i] < 0){
                ilosc += 1;
            }
        }
        return ilosc;
    }
    public static int ileZerowych(int[] tab){
        int ilosc = 0;
        for(int i = 0; i<tab.length; i++){
            if(tab[i] == 0){
                ilosc += 1;
            }
        }
        return ilosc;
    }
    public static int ileMaxymalnych(int[] tab){
        int ilosc = 0;
        int maksymalna = 0;
        for(int i = 0; i<tab.length; i++){
            if(tab[i] > maksymalna){
                maksymalna = tab[i];
            }
        }
        for(int i = 0; i<tab.length; i++){
            if(tab[i] == maksymalna){
                ilosc += 1;
            }
        }

        return ilosc;
    }
    public static int ileMinimalnych(int[] tab){
        int ilosc = 0;
        int minimalna = tab[0];
        for(int i = 0; i<tab.length; i++){
            if(tab[i] < minimalna){
                minimalna = tab[i];
            }
        }
        for(int i = 0; i<tab.length; i++){
            if(minimalna == tab[i]){
                ilosc += 1;
            }
        }

        return ilosc;
    }


    //zad4
    public static void sredniaArytmetyczna(int[] tab){
        float srednia = 0;
        for(int i = 0; i<tab.length; i++){
            srednia += tab[i];
        }
        System.out.println(srednia/tab.length);
    }
    public static void sredniaGeometryczna(int[] tab){
        float srednia = 1;
        int n = tab.length;
        for(int i = 0; i<tab.length; i++){
            srednia *= tab[i];
        }
        double sredniageo = Math.pow(srednia, (1.0/n));
        System.out.println(sredniageo);
    }

    public static int[] funkcjaLiniowa(int[] tab, int a, int b){
        for(int i = 0; i<tab.length; i++){
            tab[i] = tab[i] * a + b;
        }
        return tab;
    }
    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c){
        for(int i = 0; i<tab.length; i++){
            tab[i] = (tab[i] * tab[i]) * a + b*tab[i] + c;
        }
        return tab;
    }
    public static double[] funkcjaWykladnicza(double[] tab, int a){
        int dlugosc = tab.length;

        for(int i = 0; i<tab.length; i++){
            tab[i] = Math.pow(a, tab[i]);
        }
        return tab;
    }

    //zad6

    public static void najdluzszyCiagDodatnich(int[] tab){
        int dodatnich;
        int najwiecej = 0;

        for(int i = 0; i<tab.length; i++){
            dodatnich = 0;
            for(int j = i; j<tab.length; j++){
                if(tab[j] > 0){
                    dodatnich += 1;
                }
                else{
                    break;
                }
            }
            if(dodatnich > najwiecej){
                najwiecej = dodatnich;
            }
        }
        System.out.println(najwiecej);
    }

    public static void najdluzszyCiagUjemnych(int[] tab){
        int ujemnych;
        int najwiecej = 0;

        for(int i = 0; i<tab.length; i++){
            ujemnych = 0;
            for(int j = i; j<tab.length; j++){
                if(tab[j] < 0){
                    ujemnych += 1;
                }
                else{
                    break;
                }
            }
            if(ujemnych > najwiecej){
                najwiecej = ujemnych;
            }
        }
        System.out.println(najwiecej);
    }
    public static void odwrocTablice(int[] tab){
        int temp;
        for(int i = 0; i<tab.length/2; i++){
            temp = tab[tab.length-i-1];
            tab[tab.length-i-1] = tab[i];
            tab[i] = temp;
        }
    }
    public static void odwrocTablice(int[] tab, int indeksStart, int indeksStop){
        int temp;
        for(int i = indeksStart; i<indeksStop - indeksStart; i++){
            temp = tab[indeksStop-i];
            tab[indeksStop-i] = tab[i];
            tab[i] = temp;
        }
    }
    //zad7





    public static void main(String[] args) {
        int[] tab = generujTablice(10, -5, 10);
        System.out.println(Arrays.toString(tab));
        //wypiszTablice(tab, 25, 5);
        //System.out.println(ileMinimalnych(tab));
        //sredniaArytmetyczna(tab);
        //sredniaGeometryczna(tab);
        //System.out.println(funkcjaWykladnicza(tab, 2));
        //najdluzszyCiagDodatnich(tab);
        //najdluzszyCiagUjemnych(tab);
        //odwrocTablice(tab);
        //System.out.println(Arrays.toString(tab));
        odwrocTablice(tab, 2, 6);
        System.out.println(Arrays.toString(tab));
    }
}