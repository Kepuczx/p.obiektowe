//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class zestaw3 {
    //zad1
    public static void trojkiPitagorejskie(int n){
        for(int a = 1; a<=n;a++){
            for(int b = 1; b<=n;b++){
                for(int c = 1; c<=n;c++){
                    if(a*a + b*b == c*c){
                        System.out.println(a+ " " + b +" "+ c);
                    }
                }
            }
        }
    }
    //zad4
    public static void liczbyPierwsze(int n){
        for(int a = 2; a<=n; a++){
            if(a>3){
                int zgodnosc = 0;
                if(a%2==0){
                    zgodnosc++;
                }
                else if(a%3==0){
                    zgodnosc++;
                }
                if(zgodnosc == 0){
                    System.out.println(a);
                }
            }
            else {
                System.out.println(a);
            }
        }
    }

    //zad5
    public static void liczbyPodzielne(int m, int n){
        double dolny = Math.pow(10, m-1);
        double gorny = Math.pow(10, m) - 1;

        for(double x=dolny; x<gorny;x++){
            if(x % n == 0){
                System.out.println(x);
            }
        }
    }
    //zad6
    public static void piramida(int n, int variant){
        if(variant == 1) {
            if (n == 1) {
                System.out.println("*");
            } else if (n == 0) {
                System.out.println("Blad");
            } else {
                String piramide = "";
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                        piramide += "*";
                        System.out.println(piramide);
                    }
                }
            }
        }
        else if(variant == 2){
            String piramide = "";
            int halfN = n/2;
            for (int i = 0; i <= n - 1; i++) {
                for (int j = 0; j < n - i; j++) {
                    piramide += " ";
                }
                for (int j = 0; j < (2*i+1); j++) {
                    piramide += "*";
                }
                System.out.println(piramide);
                piramide="";
            }
        }
        else System.out.println("Blad");
    }




    public static void main(String[] args) {
        //trojkiPitagorejskie(10);
        //liczbyPierwsze(20);
        //liczbyPodzielne(3, 2);
        piramida(5, 2);

    }
}