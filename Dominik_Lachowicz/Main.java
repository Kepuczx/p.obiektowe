import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.math.MathContext;


public class Main {
    //zad1
    public static boolean dokladnosc(int x, int y, int k){
        int roznica = y - x;
        if(roznica < 0){
            roznica = -roznica;
            if(roznica == k){
                return true;
            }
        }
        else if(roznica == k){
            return true;
        }
        return false;
    }

    //zad2
    public static int najblizszySasiad(int s){
        int a = 0;
        while(a*a < s - a){
            a+=1;
        }
        return a;
    }


    //zad3

    public static double pierwiastek(int s, int n, int k){
        if(n==2){
            float x = s-1;
            while(x * x > s){
                x = (x + (s/x)) / 2;
            }
            return x;
        }
        else if(n>2){
            double x = s;
            while(Math.pow(x, n) > s){
                x = ((x*n) + (s/(Math.pow(x, n)))) / 2;
            }
            return x;
        }
        return s;
    }

    //zad4

    public static int podciag(int[] tab){
        int najdluzszy = 0;
        int temp = 0;
        for(int i = 0; i < tab.length -1; i++){
            if(tab[i] > tab[i+1]){
                temp+=1;
            }
            else{
                temp += 1;
                if(najdluzszy < temp){
                    najdluzszy = temp;
                }
                temp = 0;
            }
        }
        return najdluzszy;
    }

    //zad5

    public static int podciag(int[] tab, int r){
        int dlugosc = 0;
        int temp = 0;
        for(int i = 0; i < tab.length - 1; i++){
            if(tab[i]-r == tab[i+1]){
                temp +=1;
            }
            else{
                temp += 1;
                if(dlugosc < temp){
                    dlugosc = temp;
                }
                temp = 0;
            }
        }
        return dlugosc;
    }

    //zad6






    public static void main(String[] args) {
        System.out.println(dokladnosc(5, 3, 2));
        System.out.println(najblizszySasiad(20));
        System.out.println(pierwiastek(4, 2, 1));
        int[] tab = new int[10];
        tab[0] = 5;
        tab[1] = 1;
        tab[2] = 4;
        tab[3] = 2;
        tab[4] = 0;
        tab[5] = 5;
        System.out.println(podciag(tab, 2));

    }
}