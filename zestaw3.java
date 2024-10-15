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

    //zad2
    public static void funKwaRozwiazania(int n){
        for(int a = 0; a<=n;a++){
            for(int b = 0; b<=n;b++){
                for(int c = 0; c<=n;c++){
                    if((Math.pow(b, 2) - (4*a*c)) > 0){
                        System.out.println(n+" = "+ a+"x^2 + "+b+"x + "+c);
                    }
                }
            }
        }
    }

    //zad3
    public static void funKwaDelta(int n){
        double delta;
        for(int a = 0; a <= n; a++){
            for(int b = 0; b<=n;b++){
                for(int c = 0; c<=n;c++){
                    delta = (Math.pow(b, 2) - (4*a*c));
                    for(int i = 1; i <= n; i++){
                        if(Math.sqrt(delta) == i*i){
                            System.out.println(n+" = "+ a+"x^2 + "+b+"x + "+c);
                        }
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


    public static void silnia(int n){
        if(n <= 0){
            System.out.println("Blad");
        }
        else{
            int wynik = 1;
            for(int i = n; i>0; i--){
                wynik *= i;
            }
            System.out.println(wynik);
        }
    }

    public static void silniaPodwojna(int n){
        int wynik = 1;
        int wynik2 = 1;
        if(n < 1){
            System.out.println("Blad");
        }
        else {
            if (n % 2 == 0) {
                for (int i = n; i > 0; i -= 2) {
                    wynik *= i;
                }
                System.out.println("Dla parzystych: "+wynik);
                for (int i = n-1; i > 0; i -= 2) {
                    wynik2 *= i;
                }
                System.out.println("Dla nieparzystych: "+wynik2);

            }
            else{
                for (int i = n-1; i > 0; i -= 2) {
                    wynik *= i;
                }
                System.out.println("Dla parzystych: "+wynik);
                for (int i = n; i > 0; i -= 2) {
                    wynik2 *= i;
                }
                System.out.println("Dla nieparzystych: "+wynik2);

            }
        }
    }

    //zad9
    public static void silnia(int n, int m){
        if(n <= 0){
            System.out.println("Blad");
        }
        else{
            if(m>n){
                m = n;
            }
            int wynik = 1;
            for(int i = n; i>=m; i--){
                wynik *= i;
            }
            System.out.println(wynik);
        }
    }

    //zad10
    public static void dwumianNewtona(int n, int k){
        long topN = 1;
        long lowerK = 1;
        long toplow = 1;
        for(int i = n; i>0; i--){
            topN *= i;
        }
        for(int i = k; i>0; i--){
            lowerK *= i;
        }
        for(int i = (n-k); i>0; i--){
            toplow *= i;
        }
        long wynik = topN / (lowerK * toplow);
        System.out.println(wynik);
    }



    public static void main(String[] args) {
        //trojkiPitagorejskie(10);
        //liczbyPierwsze(20);
        //liczbyPodzielne(3, 2);
        //piramida(5, 2);
        //funKwaRozwiazania(7);
        //funKwaDelta(7);
        //silnia(3);
        //silniaPodwojna(6);
        //silnia(5, 1);
        //dwumianNewtona(8, 3);
    }
}